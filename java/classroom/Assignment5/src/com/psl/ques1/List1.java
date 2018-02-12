package com.psl.ques1;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {

	// static int n;

	ArrayList<String> studlist = new ArrayList<String>();
	Scanner s = new Scanner(System.in);

	public void add(int n) {

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the names: ");
			String str = s.nextLine();
			studlist.add(str);
		}
		// s.close();

	}

	public void search(int n) {
		int flag = 0;
		System.out.println("Enter the name to be searched: ");
		String str1 = s.next();
		
		
		/*for (int i = 0; i < n; i++) {

			if (studlist.get(i).equals(str1)) {
				flag = 1;
				break;
			}

		}*/
		
		if (studlist.contains(str1)) {
			flag = 1;		
		}
		
		
		if (flag == 0) {
			System.out.println("Record not found");

		} else {
			System.out.println("Record  found");

		}
		// s.close();

	}

	public static void main(String[] args) {
		List1 l = new List1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records you want to add: ");
		int n = sc.nextInt();

		l.add(n);
		l.search(n);
		sc.close();

	}

}
