package com.psl.sorting;

public class Employee implements Comparable<Employee> {

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + employeeSalary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeSalary != other.employeeSalary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "employee is: " + employeeId + " " + employeeSalary + " "
				+ employeeName;
		// return super.toString();
	}

}
