package com.psl.ques3;

import java.util.Scanner;
import java.util.Vector;

public class Names {

	static Vector<Names> v = new Vector<Names>();
	String fn, ln;

	public void addData(String str, String str1) {
		Names n = new Names();
		n.fn = str;
		n.ln = str1;

		v.add(n);

	}

	public void display() {

		for (int i = 0; i < v.size(); i++) {
			System.out.println("First Name: " + v.get(i).fn + " Last Name: "
					+ v.get(i).ln);

		}

	}

	public static void main(String[] args) {

		String str, str1;
		Scanner s = new Scanner(System.in);

		int choice, p = 0;

		do {
			System.out.println("Enter 1 to add First Name and Last Name");
			System.out.println("Enter 2 to display First Name and Last Name");
			System.out.println("Enter 3 to exit");
			choice = s.nextInt();
			Names fs = new Names();

			switch (choice) {

			case 1:
				str = args[2 * p];
				str1 = args[(2 * p) + 1];
				p++;
				fs.addData(str, str1);

				break;
			case 2:
				fs.display();
				break;
			case 3:
				System.out.println("Thank you");
			}

		} while (choice != 3);

		s.close();

	}
}
