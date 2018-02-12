package com.psl.exassi3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Service[] s = new Service[3];
		Service s1 = new Service();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter true or false: ");
		boolean[] str = new boolean[3];
		boolean[] str1 = new boolean[3];
		boolean[] str2 = new boolean[3];
		boolean[] str3 = new boolean[3];
		boolean[] str4 = new boolean[3];
		// = sc.nextInt();

		float max = 0;
		int flag = 0;

		for (int i = 0; i < 3; i++) {
			s[i] = new Service();

			float c = 0;

			System.out.println("FOR USER:");
			System.out.println("Are you opting for talktime service: ");
			str[i] = sc.nextBoolean();

			System.out.println("Are you opting for SMS service: ");
			str1[i] = sc.nextBoolean();

			System.out.println("Are you opting for 2G service: ");
			str2[i] = sc.nextBoolean();

			System.out.println("Are you opting for 3G service: ");
			str3[i] = sc.nextBoolean();

			System.out.println("Are you opting for 4G service: ");
			str4[i] = sc.nextBoolean();

			c = s1.choice(str[i], str1[i], str2[i], str3[i], str4[i], i);

			if (c > max) {
				max = c;
				flag = i;
			}

		}

		System.out.println("Max cost: " + max + " for user " + flag);
		System.out.println("The services opted are:");

		if (str[flag] = true) {
			System.out.println("Talktime");

		}
		if (str1[flag] = true) {
			System.out.println("SMS");

		}
		if (str2[flag] = true) {
			System.out.println("2G");

		}
		if (str3[flag] = true) {
			System.out.println("3G");

		}
		if (str4[flag] = true) {
			System.out.println("4G");

		}

		sc.close();

	}

}
