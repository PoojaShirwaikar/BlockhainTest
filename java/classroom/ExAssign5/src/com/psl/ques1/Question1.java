package com.psl.ques1;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] arg){
	
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str=s.nextLine();
		
		System.out.println("Enter the indices: ");
		System.out.println("Lower Index: ");
		int beginIndex=s.nextInt();

		
		System.out.println("Higher Index: ");
		int endIndex=s.nextInt();

		
		String str1=str.substring(beginIndex, endIndex);
		System.out.println("Substring: "+str1);
		
		s.close();
	}

}
