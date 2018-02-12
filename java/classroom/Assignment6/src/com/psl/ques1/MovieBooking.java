package com.psl.ques1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MovieBooking {
	//Scanner sc = new Scanner(System.in);
	
	public void displayDate(Connection con) throws SQLException, ParseException
	{
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date d = new Date();
		d = sdf.parse(sdf.format(d.getTime()));
		java.sql.Date sqld = new java.sql.Date(d.getTime());
		
		//System.out.println(sqld);
		
		
		String query = "select Name from details join shows on id=movieid  where  shows.dates = '" + sqld +"'";
		ResultSet r=	stmt.executeQuery(query);
		
		while (r.next()) {
			System.out.println(r.getString(1));
			
		}
		
		stmt.close();
	}
	
	
	public void displayLang(Connection con) throws SQLException
	{
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter movie language:");
		String lan = sc.next();
		
		String query = "select Name from details where  Language = '" + lan +" '";
	ResultSet r=	stmt.executeQuery(query);
	
	while (r.next()) {
		System.out.println(r.getString(1));
		
	}

		stmt.close();		
	}
	
	
	public void bookshow(Connection con) throws SQLException 
	{
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
			
		System.out.println("enter user name:");
		String user = sc.next();
		
		System.out.println("enter show id:");
		int sid = sc.nextInt();
				
		
		try{
			String query = "insert into booking (showid,uname) values( " + sid + ", '" + user + "' )";

			stmt.execute(query);
		}
		catch(SQLException e)//sid is foreign key in booking referencing shwid in shows
		{
			System.out.println("Shows unavailable");
		}

		stmt.close();
	}
	
	
	
	
	public void updateshow(Connection con) throws SQLException, ParseException
	{
		Statement stmt = con.createStatement();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter show id:");
		int sid = sc.nextInt();
		
		System.out.println("enter new show  date:");
		String date = sc.next();
		Date d = new Date();
		d = sdf.parse(date);
		System.out.println(d);
		java.sql.Date sqld = new java.sql.Date(d.getTime());
		String query = "update shows set dates= '" + sqld + "' where showid= " + sid ;
		stmt.execute(query);

		stmt.close();

	}

	public void deleteshow(Connection con) throws SQLException {
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter show id:");
		int sid = sc.nextInt();
		

		String query = "delete from shows where showid = " + sid ;

		stmt.execute(query);

		stmt.close();
		//sc.close();
	}

	public void addnewshow(Connection con) throws Exception {
		Statement stmt = con.createStatement();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter show id:");
		int sid = sc.nextInt();

		System.out.println("enter movie id:");
		int id = sc.nextInt();

		System.out.println("enter show  date:");
		String date = sc.next();

		Date d = new Date();

		d = sdf.parse(date);

		java.sql.Date sqld = new java.sql.Date(d.getTime());

		try{
			String query = "insert into shows values(" + sid + ", " + id + " , '"
					+ sqld + "')";

			stmt.execute(query);
		}	
		catch(SQLException e)//movieid is foreign key in shows referencing id in details
		{
			System.out.println("movie unavailable");
		}


		stmt.close();
	//	sc.close();

	}

	public void populatedata(Connection con) throws Exception {
		Statement stmt = con.createStatement();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		File f = new File("movies.txt");
		FileReader fis = new FileReader(f);
		BufferedReader br = new BufferedReader(fis);
		String str;
		String[] s;
		String query;

		Date d = new Date();

		while ((str = br.readLine()) != null) {

			s = str.split(",");
			d = sdf.parse(s[3]);

			java.sql.Date sqld = new java.sql.Date(d.getTime());

			// System.out.println(sqld);

			query = "insert into details values(" + Integer.parseInt(s[0])
					+ ", '" + s[1] + "' , '" + s[2] + "' , '" + sqld + "')";

			stmt.execute(query);

		}

		br.close();
		stmt.close();

	}

	public void addnewmovie(Connection con) throws SQLException, ParseException {

		Statement stmt = con.createStatement();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter movie id:");
		int id = sc.nextInt();

		System.out.println("enter movie name:");
		String name = sc.next();

		System.out.println("enter movie language:");
		String lan = sc.next();

		System.out.println("enter movie release date:");
		String date = sc.next();

		Date d = new Date();

		d = sdf.parse(date);

		java.sql.Date sqld = new java.sql.Date(d.getTime());

		String query = "insert into details values(" + id + ", '" + name
				+ "' , '" + lan + "' , '" + sqld + "')";

		stmt.execute(query);

		stmt.close();
		//sc.close();

	}
	
	
	

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("driver loaded:");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/movie", "root", "root");

			// System.out.println("create connection");

			MovieBooking m1 = new MovieBooking();

			int choice;
			Scanner s = new Scanner(System.in);

			try {
				do {
					System.out.println("Enter 0. to populate data from file");
					System.out.println("Enter 1. to add new movie");
					System.out.println("Enter 2. to add new show");
					System.out.println("Enter 3. to delete a show");
					System.out.println("Enter 4. to update a show");
					System.out.println("Enter 5. to book a show");
					System.out
							.println("Enter 6. to display movies by language");
					System.out
							.println("Enter 7. to display movies by todays shows");
					System.out.println("Enter 8. to exit");
					choice = s.nextInt();

					switch (choice) {
					case 0:

						m1.populatedata(con);
						break;
					case 1:
						m1.addnewmovie(con);
						break;

					case 2:
						m1.addnewshow(con);
						break;
					case 3:
						m1.deleteshow(con);
						break;
					case 4:
						m1.updateshow(con);
						break;
					case 5:m1.bookshow(con);
						break;
					case 6:m1.displayLang(con);
						break;
					case 7:m1.displayDate(con);
						break;

					}

				} while (choice != 8);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// stmt.close();
			con.close();
			s.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
