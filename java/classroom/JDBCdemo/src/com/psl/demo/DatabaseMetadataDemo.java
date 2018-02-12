package com.psl.demo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMetadataDemo {

	public static void main(String[] args) {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded:");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");

			System.out.println("create connection");

			DatabaseMetaData db = con.getMetaData();

			System.out.println(db.getDatabaseProductName());
			System.out.println(db.getDatabaseMajorVersion());

			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from emp");
			ResultSetMetaData rsdb =rs.getMetaData();
					
				int count=	rsdb.getColumnCount();
				System.out.println(count);
				
				
				for (int i = 1; i <= count; i++) {
					System.out.println(rsdb.getColumnName(i)+" :"+rsdb.getColumnTypeName(i));
	
				}
			
			
			/*ResultSet rs = db.getTables(null, null, null, new String[10] );
			
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}*/

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
