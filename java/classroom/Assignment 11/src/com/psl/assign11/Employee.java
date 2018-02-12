package com.psl.assign11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {

	public void updatesal(Connection con, int empno) {

		Scanner sc = new Scanner(System.in);

		try {
			Statement stmt = con.createStatement();
			int count = 0;
			String query1 = "select sal from emp where empno=" + empno;
			ResultSet r = stmt.executeQuery(query1);
			while (r.next()) {
				count++;
				System.out.println("Current salary of employee is: ");
				System.out.println(r.getString(1));
			}

			System.out.println("enter new employee salary");
			int esal = sc.nextInt();

			String query = "UPDATE emp SET sal = " + esal + " where empno="
					+ empno;
			stmt.execute(query);
			/*
			 * while (r.next()) { count ++;
			 * System.out.println("new salary of employee is: ");
			 * System.out.print(r.getString(1)); }
			 */

			if (count == 0)
				System.out.println("Employee doesnt exist");

			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void displayemployee(Connection con, int empno) {

		try {
			Statement stmt = con.createStatement();

			String query = "select * from emp where empno=" + empno;
			int count = 0;
			ResultSet r = stmt.executeQuery(query);
			while (r.next()) {
				count++;
				System.out.println(r.getString(1) + " " + r.getString(2) + " "
						+ r.getString(3) + " " + r.getString(4) + " "
						+ r.getString(5) + " " + r.getString(6) + " "
						+ r.getString(7) + " " + r.getString(8));
			}

			if (count == 0)
				System.out.println("Employee doesnt exist");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void countrecords(Connection con) {
		Statement stmt;
		try {
			stmt = con.createStatement();

			System.out.println("\nThe number of records in table are:");
			String query = "select count(empno) from emp ";
			ResultSet r = stmt.executeQuery(query);
			while (r.next()) {
				System.out.println(r.getString(1));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void display5records(Connection con) {
		Statement stmt;
		try {
			stmt = con.createStatement();

			System.out.println("the first 5 records are:");
			String query = "select empno, ename, sal from emp limit 5";
			ResultSet r = stmt.executeQuery(query);

			while (r.next()) {
				System.out.println(r.getString(1) + " " + r.getString(2) + " "
						+ r.getString(3));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertrecords(Connection con) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Statement stmt = con.createStatement();

			Scanner sc = new Scanner(System.in);

			System.out.println("enter employee id:");
			int empno = sc.nextInt();

			System.out.println("enter employee name:");
			String name = sc.next();

			System.out.println("enter employee job:");
			String job = sc.next();

			System.out.println("enter employee mgr:");
			int mgr = sc.nextInt();

			System.out.println("enter employee hire date:");
			String date = sc.next();
			Date d = new Date();

			System.out.println("enter employee salary:");
			int sal = sc.nextInt();

			System.out.println("enter comm:");
			int comm = sc.nextInt();

			System.out.println("enter dept number:");
			int deptno = sc.nextInt();

			d = sdf.parse(date);
			java.sql.Date sqld = new java.sql.Date(d.getTime());

			String query = "insert into emp values(" + empno + ", '" + name
					+ "' , '" + job + "'," + mgr + ", '" + sqld + "'," + sal
					+ "," + comm + "," + deptno + ")";

			stmt.execute(query);
			stmt.close();

			sc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee", "root", "root");

			Employee e1 = new Employee();

			for (int i = 0; i < 10; i++) {
				e1.insertrecords(con);
			}

			e1.display5records(con);

			e1.countrecords(con);

			Scanner sc = new Scanner(System.in);

			System.out.println("enter employee id:");
			int empno = sc.nextInt();
			e1.displayemployee(con, empno);

			e1.updatesal(con, empno);

			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("driver loaded:");
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
