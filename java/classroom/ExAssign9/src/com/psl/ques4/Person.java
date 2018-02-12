package com.psl.ques4;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable{

	String		Name;
	String		Address;
	Date		DateOfBirth;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	


}
