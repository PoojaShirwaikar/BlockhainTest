package com.psl.ques5;


import java.util.Date;


public class Employee implements Comparable<Employee> {

	
	int employeeId , employeeSalary ;
	String employeeName ;
	Date doj= new Date();

	public Employee(int d, int salary, String name,	Date dateof) {

		employeeId = d;
		employeeSalary = salary;
		employeeName = name;
		doj=dateof;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doj == null) ? 0 : doj.hashCode());
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
		if (doj == null) {
			if (other.doj != null)
				return false;
		} else if (!doj.equals(other.doj))
			return false;
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

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
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

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "employee is: " + employeeId + " " + employeeSalary
				+ " " + employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
	
	
	
	
	
	

}
