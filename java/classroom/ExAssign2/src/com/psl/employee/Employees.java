package com.psl.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employees {
	
	public void updatedetails(Connection con,int id, String designation1,int salary){
		Statement stmt;
		try {
			stmt = con.createStatement();
			String query = "update empdetails set empdesignation='"+designation1+"' , empsalary="+salary+" where empid="+id;
			stmt.execute(query);

			populatedata(con);

			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchdesignation(Connection con, String designation)
	{
		Statement stmt;
		try {
			stmt = con.createStatement();
			String query = "select empid,empname from empdetails where empdesignation='"+designation+"'";
			ResultSet r = stmt.executeQuery(query);

			while (r.next()) {
				
			
					System.out.println("Employee id: "+r.getInt(1) + "\tEmployee name: " + r.getString(2));
				
				
			}

			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void populatedata(Connection con) {
		Statement stmt;
		try {
			stmt = con.createStatement();
			String query = "select empid, empname, empdesignation,empsalary from empdetails";
			ResultSet r = stmt.executeQuery(query);

			while (r.next()) {
				System.out.println(r.getInt(1) + "\t" + r.getString(2) + "\t"
						+ r.getString(3) + "\t" + r.getString(4));
			}

			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Employees e = new Employees();
		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("driver loaded:");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/empdb", "root", "root");

			e.populatedata(con);
			
			System.out.println("\nEnter employee designation");
			String designation=sc.next();
			e.searchdesignation(con,designation);
			
			System.out.println("\nEnter employee id whose details you want to update");
			int id=sc.nextInt();
			System.out.println("\nEnter new employee designation");
			String designation1=sc.next();
			System.out.println("\nEnter new employee salary");
			int salary=sc.nextInt();
			e.updatedetails(con,id,designation1,salary);
			
			
			con.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
