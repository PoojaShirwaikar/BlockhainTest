package com.psl.ques1;

public class Tablet extends Medicine{

	
	public Tablet(String company, String addr) {
		super(company, addr);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();
		
		System.out.println("Store in a cool and dry place");

	}
	
	
}
