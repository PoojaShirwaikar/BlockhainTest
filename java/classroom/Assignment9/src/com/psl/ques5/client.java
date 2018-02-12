package com.psl.ques5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class client {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);

	static Set<Employee> set = new TreeSet<Employee>();

	public static void joinbeforedate(String str) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		try {
			Iterator<Employee> it = set.iterator();
			Employee e = null;
			c1.setTime(sdf.parse(str));
			while (it.hasNext()) {
				e = it.next();
				c2.setTime(e.getDoj());
				int c = c2.compareTo(c1);
				if (c == -1)
					System.out.println(e.employeeName);
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void sixmonths() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.add(Calendar.MONTH, -6);

		// System.out.println(c1.getTime());
		// System.out.println(c2.getTime());

		Iterator<Employee> it = set.iterator();
		Employee e = null;
		while (it.hasNext()) {
			e = it.next();
			c2.setTime(e.getDoj());
			int c = c2.compareTo(c1);
			if (c == -1)
				System.out.println(e.employeeName);
		}

	}

	public static void main(String[] args) {

		Date d1 = null;
		Date d2 = null;
		Date d3 = null;

		try {
			d1 = sdf.parse("4/04/2017");
			d2 = sdf.parse("4/06/2016");
			d3 = sdf.parse("10/10/2017");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Employee e1 = new Employee(101, 500000, "pooja", d1);
		Employee e2 = new Employee(102, 120000, "vibhuti", d2);
		Employee e3 = new Employee(103, 120000, "nidhi", d3);

		set.add(e1);
		set.add(e2);
		set.add(e3);

		System.out.println(set);

		System.out.println("Employee joining before 5th aug 2016");
		joinbeforedate("05/08/2016");

		System.out.println("Employee completing 6 months");
		sixmonths();

	//	Set<Employee> set1 = new TreeSet<Employee>(new Sortbydate());
		List<Employee> list = new ArrayList<Employee>();
		
		list.addAll(set);

		Collections.sort(list, new Sortbydate());

	//	set1.addAll(set);
	

		System.out.println(list);

	}

}
