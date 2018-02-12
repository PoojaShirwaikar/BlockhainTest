package com.psl.ques1;

public class Medicine {
	
	String company="Lupin";
	String addr="verna";
	
	
public Medicine(String company, String addr){
		
		System.out.println("medicine");

		this.company=company;
		this.addr=addr;
		
	}

	 void displayLabel() {
		// TODO Auto-generated method stub

		System.out.println("Company: "+company+" addr: "+addr);
		
	}
	
	
	
}
