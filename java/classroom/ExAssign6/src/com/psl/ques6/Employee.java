package com.psl.ques6;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Employee implements Comparable<Employee> {
	List<Employee> list = new ArrayList<Employee>();

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);

	int employee_ID;
	String employee_Name;
	long employee_Telephone;
	Date employee_DOJ;
	DOB b;

	public Employee(int employee_ID, String employee_Name,
			long employee_Telephone, Date employee_DOJ, DOB b) {
		this.employee_ID = employee_ID;
		this.employee_Name = employee_Name;
		this.employee_Telephone = employee_Telephone;
		this.employee_DOJ = employee_DOJ;
		this.b = b;

	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.employee_DOJ.compareTo(e.employee_DOJ);
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "employee is: " + employee_ID + " " + employee_Name;
	}

	public class DOB {

		int day;
		String month;
		int year;

		public DOB(int day, String month, int year) {
			// TODO Auto-generated constructor stub
			this.day = day;
			this.month = month;
			this.year = year;
		}

	}

	public void addemployee(int employee_ID, String employee_Name,
			long employee_Telephone, String employee_DOJ, int day,
			String month, int year) {
		Date d = null;
		DOB b = new DOB(day, month, year);
		try {
			d = sdf.parse(employee_DOJ);

			Employee e1 = new Employee(employee_ID, employee_Name,
					employee_Telephone, d, b);
			list.add(e1);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list.toString());

	}

	public void searchemployeee(String month) {
		Iterator<Employee> it = list.iterator();
		int flag = 0;
		while (it.hasNext()) {
			Employee e = it.next();

			if (e.b.month.equals(month)) {
				System.out.println(e.employee_Name);
				flag = 1;
			}

		}

		if (flag == 0) {
			System.out.println("No records found");
		}
	}

	public long workexperience(int id) {
		Date d1 = new Date();
		Calendar c = Calendar.getInstance();
		long diffDays = 0, diffyears = 0;

		try {
			d1 = sdf.parse(sdf.format(d1.getTime()));
			// System.out.println(d1);

			Iterator<Employee> it = list.iterator();
			while (it.hasNext()) {
				Employee e = it.next();

				if (e.employee_ID == id) {
					Date d2 = e.employee_DOJ;
					// System.out.println(d2);

					long diff = d1.getTime() - d2.getTime();
					diffDays = diff / (24 * 60 * 60 * 1000);
					// diffyears=diffDays/365;

					// System.out.println(diffDays);

				}

			}

		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return diffDays;

	}

	public void gratuity() {
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			long l = workexperience(e.employee_ID);
			if (l > 1825 || l == 1825) {
				System.out.println(e.employee_Name);
			}
		}
	}

	public void descendingsort() {
		Collections.sort(list);
		System.out.println(list.toString());

	}

}
