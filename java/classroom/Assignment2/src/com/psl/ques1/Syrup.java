package com.psl.ques1;

public class Syrup extends Medicine{

	public Syrup(String company, String addr) {
		super(company, addr);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();		
		System.out.println("shake well before use");

	}
	
}
