package com.psl.ques6;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Employee e1 = new Employee();

		Scanner sc = new Scanner(System.in);
		int key = 0;

		do {
			System.out.println("Enter 1.Add Employee");
			System.out.println("Enter 2.Search Employee");
			System.out.println("Enter 3.Work experience");
			System.out.println("Enter 4.Gratuity eligibility");
			System.out.println("Enter 5.Sort by experience");
			System.out.println("Enter 6.to Quit");

			key = sc.nextInt();

			switch (key) {
			case 1:
				System.out.println("Enter employee id");
				int id = sc.nextInt();
				System.out.println("Enter name:");
				String name = sc.next();
				System.out.println("Enter telephone number");
				long ph = sc.nextLong();
				System.out.println("Enter Date of joining");
				String doj = sc.next();
				System.out.println("Enter Date of Birth");
				int day = sc.nextInt();
				String month = sc.next();
				int year = sc.nextInt();

				e1.addemployee(id, name, ph, doj, day, month, year);

				break;

			case 2:
				System.out.println("Enter a month");
				String monthh = sc.next();
				e1.searchemployeee(monthh);

				break;

			case 3:
				System.out.println("Enter employee id");
				int id1 = sc.nextInt();
				long w=e1.workexperience(id1);
				System.out.println("Work experience: "+w+" days");

				break;
			case 4:e1.gratuity();

				break;
			case 5:e1.descendingsort();

				break;
			}

		} while (key != 6);

		sc.close();
	}
}
