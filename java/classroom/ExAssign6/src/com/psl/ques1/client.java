package com.psl.ques1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {

		List<Cities> list = new ArrayList<Cities>();
		Scanner sc = new Scanner(System.in);
		Cities c = null;
		System.out.println("Enter n:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter city id");
			int b = sc.nextInt();

			System.out.println("Enter city name");
			String s = sc.next();

			System.out.println("Enter city info");
			String s1 = sc.next();

			c = new Cities(b, s, s1);

			list.add(c);

		}
		System.out.println(list);

		System.out.println("\n");
		for (Cities cities : list) {

			System.out.println(cities);
		}

		System.out.println("\n");
		Iterator<Cities> it = list.iterator();

		while (it.hasNext()) {
			Cities str = it.next();
			System.out.println(str);
			it.remove();
		}

		System.out.println("\n");
		System.out.println("After removing cities");
		System.out.println(list);
	}

}
