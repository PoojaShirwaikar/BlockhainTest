package com.psl.ques4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int str = s.nextInt();

		int r = 1;

		for (int i = 1; i <= 10; i++) {
			r = str * i;

			System.out.println(str + " * " + i + " = " + r);

		}

		s.close();
	}

}
