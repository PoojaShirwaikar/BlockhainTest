package com.psl.employee;

public class Employee {
	
	static int employeeId;
	int employeeSalary;
	String employeeName;
	
	public Employee(String name, int salary) {
		// TODO Auto-generated constructor stub
		
		employeeId++;
		
		employeeSalary=salary;
		employeeName=name;
	}
	
	private void displayEmployee(){
		System.out.println("employee: " + employeeId + employeeName + employeeSalary);

		
	}
	
	@Override
	public  String toString() {
		// TODO Auto-generated method stub
		return "employee: by to string " + employeeId + employeeName + employeeSalary;
	}
	
	
	
	
	public static void main(String[] args){
		
		Employee e1=new Employee("Ashish",100000);
		e1.displayEmployee();
		
		Employee e2=new Employee("gauresh",120000);
		e2.displayEmployee();
		
		Employee e3=new Employee("prabhav",150000);
		e3.displayEmployee();
		
		System.out.println(e1);
		
	}

}
