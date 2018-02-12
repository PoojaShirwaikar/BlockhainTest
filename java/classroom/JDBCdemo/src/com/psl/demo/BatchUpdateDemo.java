package com.psl.demo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateDemo {

	public static void main(String[] args) {

		Connection con = null;

		String query = "select id, name from emp";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded:");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");

			System.out.println("create connection");

			Statement stmt = con
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery(query);

			rs.absolute(5);
			rs.relative(-2);
			rs.updateInt(1, 444);
			rs.updateRow();
			
			rs.beforeFirst();

			while(rs.next())
			{
				System.out.println(rs.getInt(1) +" "+ rs.getString(2));

			}
			
			rs.close();
			stmt.close();
			

			/*
			 * stmt.addBatch("update emp set name='sampat' where id=111)");
			 * 
			 * stmt.addBatch("insert into emp values(201,'prabhav')");
			 * stmt.addBatch("insert into emp values(202,'vibhuti')");
			 * stmt.addBatch("insert into emp values(206,'mubina')");
			 * stmt.addBatch("insert into emp values(111,'ashish')");
			 * 
			 * stmt.addBatch("insert into emp values(203,'pooja')");
			 * 
			 * stmt.addBatch("insert into emp values(204,'namrata')");
			 * 
			 * int i[] = stmt.executeBatch(); for (int j = 0; j < i.length; j++)
			 * { System.out.println(i[j]); }
			 */
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
