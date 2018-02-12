package com.psl.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {

		Employee e1 = new Employee(102, 800000, "Spiderman");
		Employee e2 = new Employee(101, 70000, "Batman");
		Employee e3 = new Employee(103, 60000, "James Bond");

		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		System.out.println("before " + list);

		Collections.sort(list);
		System.out.println("after comparable" + list);

		// Collections.sort(list, new SortBySalary());

		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				int i = 0;

				if (o1.employeeSalary > o2.employeeSalary)
					return 1;
				else if (o1.employeeSalary < o2.employeeSalary)
					return -1;
				else
					return 0;

				// TODO Auto-generated method stub
				// return 0;
			}

		});

		System.out.println("after comparator: salary" + list);

		Collections.sort(list, new SortByName());
		System.out.println("after comparator: name" + list);

	}

}
