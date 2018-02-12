package com.psl.ques5;

import java.util.Scanner;

public class Adder extends Arithmetic{


	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int str = s.nextInt();
		System.out.println("Enter another number: ");
		int str1 = s.nextInt();
		Adder a = new Adder();
		
		int ss=a.add(str, str1);
		System.out.println("Sum: "+ss);
		
		s.close();
	}
	
}
