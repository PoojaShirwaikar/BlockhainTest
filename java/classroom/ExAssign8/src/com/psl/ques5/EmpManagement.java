package com.psl.ques5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpManagement {

	public void addEmp(int id, String name, String addr, int contact,
			int salary, Connection con) {
		Statement stmt;
		try {
			stmt = con.createStatement();

			String quesry = "insert into EMPIDBI values (" + id + ", '" + name
					+ "', '" + addr + "'," + contact + ", " + salary + ")";
			stmt.execute(quesry);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void displayAll(Connection con) {
		Statement stmt;
		try {
			stmt = con.createStatement();
			String quesry = "select * from EMPIDBI";
			ResultSet rs = stmt.executeQuery(quesry);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
						+ rs.getString(3) + " " + rs.getInt(4) + " "
						+ rs.getInt(5));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void searchEmp(int id, Connection con) {
		Statement stmt;
		try {
			stmt = con.createStatement();
			String quesry = "select * from EMPIDBI where empid=" + id;
			ResultSet rs = stmt.executeQuery(quesry);

			if (rs.next()) {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2)
							+ " " + rs.getString(3) + " " + rs.getInt(4) + " "
							+ rs.getInt(5));

				}

			} else {
				System.out.println("Emp does not exist");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		EmpManagement e1 = new EmpManagement();
		Scanner sc = new Scanner(System.in);
		int key = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bank", "root", "root");

			// Statement stmt = con.createStatement();

			do {
				System.out.println("Enter 1.  to add employee");
				System.out.println("Enter 2.  to display all employee");
				System.out.println("Enter 3.  to search employee");
				System.out.println("Enter 4.  to exit");
				key = sc.nextInt();

				switch (key) {
				case 1:
					System.out.println("Enter employee id");
					int id = sc.nextInt();
					System.out.println("Enter employee name");
					String name = sc.next();
					System.out.println("Enter employee address");
					String addr = sc.next();
					System.out.println("Enter employee contact");
					int contact = sc.nextInt();
					System.out.println("Enter employee salary");
					int salary = sc.nextInt();

					e1.addEmp(id, name, addr, contact, salary, con);
					break;

				case 2:
					e1.displayAll(con);

					break;
				case 3:
					System.out.println("enter employee id you want to search:");
					int ei = sc.nextInt();
					e1.searchEmp(ei, con);

					break;
				case 4:

					break;

				}

			} while (key != 4);

			/*
			 * String quesry1 = "Select * from EMPIDBI "; ResultSet rs =
			 * stmt.executeQuery(quesry1);
			 */

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
