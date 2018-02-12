package com.psl.ques1;

import java.io.*;
import java.util.*;
import java.sql.Date;

//import java.text.DateFormat;

public class Contact {

	// Stack<Contact> stack = new Stack<Contact>();

	String first_name, last_name, email;
	// String middle_name, gender, addr, area, city,state,country,website;
	Date date_of_birth;
	// Date anniversary;
	// int pincode;
	long phone, mobile;

	public Contact(String name, String last, String email, Date d, long ln,
			long mn) {
		// stack.setSize(2);

		first_name = name;
		last_name = last;
		this.email = email;
		date_of_birth = d;
		phone = ln;
		mobile = mn;
	}

	
	void validate() {
		try {

			if (first_name == null || last_name == null || email == null) {
				throw new CheckDetails("First Name, Last Name or Email missing");
			} else if (!(email.contains("@") && email.contains(".com"))) {
				throw new CheckDetails("Invalid email format");
			} else if (phone == 0d || mobile == 0d) {
				throw new CheckDetails("Enter atleast one contact number");
			} else {
				System.out.println("No Error");

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		Date dd = new Date(8, 11, 1995);

		Contact c = new Contact("pooja", "shirwaikar", "pooja@shirwaikar.com",
				dd, 15798, 48747l);

		c.validate();
		
	}

}
