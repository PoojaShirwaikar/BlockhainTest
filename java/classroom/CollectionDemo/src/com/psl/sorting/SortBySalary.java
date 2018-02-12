package com.psl.sorting;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{


@Override
public int compare(Employee o1, Employee o2) {
	
	int i=0;
	
	if (o1.employeeSalary > o2.employeeSalary)
		return 1;
	else if (o1.employeeSalary < o2.employeeSalary)
		return -1;
	else
		return 0;
	
	
	// TODO Auto-generated method stub
//	return 0;
}



}
