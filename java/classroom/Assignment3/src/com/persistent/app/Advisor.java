package com.persistent.app;

public class Advisor {

	public  String[] message;
	
	public Advisor() {
		// TODO Auto-generated constructor stub
		
		message = new String[5];
		message[0]="advice 1";
		message[1]="advice 2";
		message[2]="advice 3";
		message[3]="advice 4";
		message[4]="advice 5";
		
	}
	
	
	public  String getAdvice(){
		int rand=(int)(Math.random()*5);
			return message[rand];	
	}
	
	
	
}
