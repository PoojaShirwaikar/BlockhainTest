package com.psl.mydate;

public class MyDate { // to display date

	private int date, month, year; // instance variables

	/*
	 * private void initDate(){
	 * 
	 * date=10; month=9; year=2017;
	 * 
	 * }
	 */
	
	
	public MyDate() {
		// TODO Auto-generated constructor stub
		
		date = 10;
	}


	public MyDate(int month, int year) {
		// TODO Auto-generated constructor stub
		this();
		this.month = month;
		this.year = year;
	}

	private void displayDate() {

		System.out.println("Todays date is : " + date + " : " + month + " : "
				+ year);
	}

	public static void main(String[] args) {

		MyDate obj; // reference
		obj = new MyDate(7,2007); // object

		// obj.initDate();

		obj.displayDate();

	}

}
