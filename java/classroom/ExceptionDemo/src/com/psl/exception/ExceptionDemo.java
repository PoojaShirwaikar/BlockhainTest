package com.psl.exception;

import java.awt.DisplayMode;

public class ExceptionDemo {

	
	void display(){
		System.out.println("display");
		
		
	}
	
	public static void main(String[] args) {

		
		int result, a = 10, b = 2;
		ExceptionDemo obj=null;

		try {
			// run time exception
			result = a / b;
			System.out.println("RESULT: " + result);

			
			obj.display();

		} catch (ArithmeticException e) {

			System.out.println("Hey... dude you cant divide by zero. Now i am dividing by 2");
			b=2;
			result = a / b;

			System.out.println("RESULT: " + result);
			System.out.println("Now its good");

		}
		catch (NullPointerException e) {

			System.out.println("Null pointer");
			obj=new ExceptionDemo();
			obj.display();

			System.out.println("fine");

		}

		System.out.println("All looks good");

	}

}
