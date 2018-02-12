package com.psl.demo;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int divide(int a, int b) {
		int c = 0;
		try{
			 c= a / b;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			
		}
		return c;
	}
}
