package com.psl.ques2;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] arg) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String str = s.nextLine();

		System.out.println("Enter another String: ");
		String str1 = s.nextLine();

		int[] counter = new int[40];
		// int[] counter1 = { 0 };
		

		if (str.length() != str1.length()) {
			System.out.println("Not Anagrams: SIZE MISMATCH ");
		} else {

			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == str.charAt(i)) {
						counter[i]++;
					}
				}
			}

			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str1.length(); j++) {
					if (str.charAt(i) == str1.charAt(j)) {
						counter[i]--;
					}

				}
			}

			int flag = 0;
			for (int i = 0; i < counter.length; i++) {
				if (counter[i] != 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 1)
				System.out.println("Not Anagrams");
			else if (flag == 0)
				System.out.println(" Anagrams");

			/*
			 * for (int i = 0; i < str1.length(); i++) { for (int j = 0; j <
			 * str1.length(); j++) { if (str1.charAt(j) == str1.charAt(i)) {
			 * counter1[i]++; } } }
			 */

		}
		s.close();
	}
}
