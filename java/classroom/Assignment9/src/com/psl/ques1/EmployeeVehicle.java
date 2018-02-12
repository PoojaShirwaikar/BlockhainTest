package com.psl.ques1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeVehicle {
	static Scanner sc = new Scanner(System.in);

	public void addvehicle() {
		List<String> list = new ArrayList<String>();
		Set<Employee> set = new HashSet<Employee>();
		String str;
		int n, n1;

		System.out.println("Enter employee id");
		n1 = sc.nextInt();

		System.out.println("Enter no. of vehicles for employee id " + n1);
		n = sc.nextInt();

		// Scanner s = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			System.out.println("Enter vehicle:");
			str = sc.next();
			list.add(str);
		}

		
		System.out.println(list);
		Employee e1 = new Employee(n1, list);
		
		//System.out.println(e1);
		set.add(e1);

		System.out.println(set);
	}
	
	

	public static void main(String[] args) {
		// List<String> list1 = new ArrayList<String>();
		Set<Employee> set = new HashSet<Employee>();

		EmployeeVehicle e1 = new EmployeeVehicle();

		e1.addvehicle();

	}

}
