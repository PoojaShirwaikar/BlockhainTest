package com.psl.ques2;

import java.sql.SQLException;


public class PersonNotFoundException extends Exception {

	public PersonNotFoundException() {
		// TODO Auto-generated constructor stub
		
		System.out.println("User not found");
		
	}

}
