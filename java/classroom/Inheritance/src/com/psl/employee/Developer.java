package com.psl.employee;

public class Developer extends Employee {

	public Developer(int d, int salary, String name, int pf, int ta, int HRA) {
		super(d, salary, name);
		// TODO Auto-generated constructor stub
		System.out.println("developer");
		this.pf = pf;
		this.ta = ta;
		this.HRA = HRA;
	}

	@Override
	void displayEmployee() {
		// TODO Auto-generated method stub
	//	super.displayEmployee();

		int netSalary = employeeSalary + ta + pf + HRA;

		System.out.println("Developer is: " + employeeId + " " + employeeName
				+ " " + employeeSalary + " " + netSalary);
	}

	int pf = 5000, ta = 10000, HRA = 20000;

	/*
	 * void displayDeveloper(){
	 * 
	 * super.displayEmployee();
	 * 
	 * int netSalary= employeeSalary + ta + pf + HRA;
	 * 
	 * System.out.println("Developer is: "+employeeId+" "+employeeName+" "+
	 * employeeSalary+" "+netSalary); }
	 */

}
