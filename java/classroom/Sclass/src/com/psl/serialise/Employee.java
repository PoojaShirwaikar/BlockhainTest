package com.psl.serialise;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable {

	int employeeId = 107, employeeSalary = 10000;
	String employeeName = "James Bond";

	public Employee(int d, int salary, String name) {

		// System.out.println("employee");

		employeeId = d;
		employeeSalary = salary;
		employeeName = name;

	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub

		if (this.employeeId > o.employeeId)
			return 1;
		else if (this.employeeId < o.employeeId)
			return -1;
		else
			return 0;
	}

	/*
	 * void displayEmployee() { // TODO Auto-generated method stub
	 * 
	 * System.out.println("employee is: "+employeeId+" "+employeeSalary+" "+
	 * employeeName);
	 * 
	 * }
	 */

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "employee is: " + employeeId + " " + employeeSalary + " "
				+ employeeName;
		// return super.toString();
	}

}
