package com.psl.ques3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int str = s.nextInt();
		int isprime = 0;

		if (str % 2 == 0) {
			isprime = 1;
		}

		if (isprime == 0) {

			System.out.println("Number is odd");

		}
		else
		{
			if(str>=2 && str<=5)
				System.out.println("Number is even and between 2 to 5");
			else if(str>=6 && str<=20)
				System.out.println("Number is even and between 6 to 20");
			else if(str>20)
				System.out.println("Number is even and greater then 20");
		}
		
		s.close();

	}

}
