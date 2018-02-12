package com.psl.ques4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Employee extends Person implements Serializable {

	int Id;
	transient int employeeSalary;
	static ArrayList<Employee> a = new ArrayList<Employee>();

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public static ArrayList<Employee> getA() {
		return a;
	}

	public static void setA(ArrayList<Employee> a) {
		Employee.a = a;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", employeeSalary=" + employeeSalary
				+ ", Name=" + Name + ", Address=" + Address + ", DateOfBirth="
				+ DateOfBirth + "]";
	}

	public static void main(String[] args) {
		Employee ee = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many records you want to add");
		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {

			System.out.println("Enter employee id");
			int id = sc.nextInt();

			System.out.println("Enter employee name");
			String name = sc.next();

			System.out.println("Enter salary");
			int sal = sc.nextInt();

			System.out.println("Enter address");
			String addr = sc.next();

			System.out.println("Enter birth date");
			String dateob = sc.next();

			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				d = sdf.parse(dateob);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ee.setId(id);
			ee.setName(name);
			ee.setEmployeeSalary(sal);
			ee.setAddress(addr);
			ee.setDateOfBirth(d);

			// System.out.println(ee);
			a.add(ee);

		}

		File f1 = new File("serialised.ser");
		if (!f1.exists()) {
			System.out.println("file doesnt exist");

			try {
				f1.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(f1);
			oos = new ObjectOutputStream(fos);

			for (Employee stud : a) {
				try {
					oos.writeObject(stud);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println("serialization done");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		ArrayList<Employee> aa = new ArrayList<Employee>();
		

	try {
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		//Employee c1 = null;
		while (fis.available() > 0) {
			// count++;
			//c1 = new Employee();
			ee = (Employee) ois.readObject();
			aa.add(ee);
			// System.out.println(set1);

		}

		// System.out.println(count);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("\nAfter deserialisation");
		for (Employee student : aa) {
			System.out.println(student);
		}
		

	}

}
