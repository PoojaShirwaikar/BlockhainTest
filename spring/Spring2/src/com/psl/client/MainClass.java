package com.psl.client;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beansconfig.xml");

		EmployeeService s = context.getBean("service", EmployeeService.class);
		Employee e = context.getBean("emp", Employee.class);
		//s.createEmployee(e);
		System.out.println("INSERT done");
		List<Employee> list = s.getAllEmployees();

		for (Employee employee : list) {
			System.out.println(employee.getName());
		}
		// s.updateEmployee(12, "POOJA");
		// System.out.println("UPDATE done");
		// s.deleteEmployee(12);
		// System.out.println("delete done");

	}

}
