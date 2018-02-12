package com.psl.ques1;

public class Ointment extends Medicine{

	
	public Ointment(String company, String addr) {
		super(company, addr);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();
				
		System.out.println("for external use only");

	}
}
