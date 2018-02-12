package com.psl.sorting;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

@Override
public int compare(Employee o1, Employee o2) {
	// TODO Auto-generated method stub
	return o1.employeeName.compareTo(o2.employeeName);
}
}
