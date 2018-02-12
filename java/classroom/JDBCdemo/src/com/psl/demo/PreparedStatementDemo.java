package com.psl.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		//String query = "select id,name from emp";

		Connection con=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded:");

			 con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");

			System.out.println("create connection");

		
			/*
			 * PreparedStatement pstmt =
			 * con.prepareStatement("insert into emp values(?,?)");
			 */		
			
			
		CallableStatement cst=	con.prepareCall("{call Myprocedure(?,?)}");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();
			cst.setInt(1, id);
			
			System.out.println("Enter name");
			String name=sc.next();
			cst.setString(2, name);
			
			cst.execute();
			
			System.out.println("done!!");
				
			//con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
