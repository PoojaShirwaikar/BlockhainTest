package com.psl.ques2;

public class Employee {

	int employeeId=107, employeeSalary=10000;
	String employeeName="James Bond";
	
	public Employee(int d, int salary, String name){
		
		System.out.println("employee");

		employeeSalary=salary;
		employeeName=name;
		
	}
	
	
	void displayEmployee() {
		// TODO Auto-generated method stub

		System.out.println("employee is: "+employeeId+" "+employeeSalary+" "+employeeName);
		
	}
	
	
	
}
