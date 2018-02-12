package com.psl.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {

	public static void main(String[] args) {

		//String query = "Create table emp(id int(10), name varchar(20))";
		
		//String query = "insert into emp values(122, 'Chetana')";

		//String query = "update emp set name='Anusaya' where id= 121";

		String query = "select id,name from emp";

		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded:");

			Connection con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");

			System.out.println("create connection");

			Statement stmt = con.createStatement();

			ResultSet r= stmt.executeQuery(query);
			
			while (r.next()) {
				System.out.println(r.getInt(1)+r.getString(2));
				
			}
			
			
			
			stmt.close();			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
