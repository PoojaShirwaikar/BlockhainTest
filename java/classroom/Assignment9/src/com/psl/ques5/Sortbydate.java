package com.psl.ques5;

import java.util.Comparator;

public class Sortbydate implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.doj.compareTo(o2.doj);
		 
	}

}
