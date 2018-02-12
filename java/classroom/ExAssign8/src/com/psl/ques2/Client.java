package com.psl.ques2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Client {

	static TreeMap<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>();

	public void addPerson(Connection con) {
		Statement stmt;
		try {
			stmt = con.createStatement();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter id: ");
			int id = sc.nextInt();

			System.out.println("Enter name: ");
			String name = sc.next();

			System.out.println("Enter phone number: ");
			int phone = sc.nextInt();

			String query = "insert into Person values(" + id + ", '" + name
					+ "', " + phone + ")";
			stmt.execute(query);

			sc.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readfile(String s) {
		
		String str = null;
		int count=0;
		File f = new File(s);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));

			String array[];

			while ((str = br.readLine()) != null) {
				ArrayList<String> list = new ArrayList<String>();
				
				// System.out.println(str);
				array = str.split(":");

				 System.out.println(array[0]);
				String[] array1 = array[0].split(",");

				 System.out.println(array[1]);
				String[] array2 = array[1].split(";");
				
				System.out.println(array2.length);
				/*for (String string : array2) {
					count++;
					//System.out.println(string);
				}
				System.out.println("iiiiii"+count);*/

				for (int i = 0; i < array2.length; i++)
				{
					list.add(array2[i]);

				}
				
				

				map.put(array1[0], list);

				// System.out.println(map);

				/*
				 * System.out.println(array2[0]); String[]
				 * array3=array2[0].split(",");
				 * 
				 * System.out.println(array2[1]); String[]
				 * array4=array2[1].split(",");
				 * 
				 * System.out.println(array2[2]); String[]
				 * array5=array2[2].split(",");
				 * 
				 * System.out.println(array2[3]); String[]
				 * array6=array2[3].split(",");
				 * 
				 * System.out.println(array2[4]); String[]
				 * array7=array2[4].split(",");
				 */

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void CheckPerson(Connection con) throws PersonNotFoundException{
		Statement stmt;
		String name = null;
		Scanner sc = new Scanner(System.in);

		int flag = 0;
		try {
			stmt = con.createStatement();

			System.out.println("Enter name: ");
			name = sc.next();

			String quesry1 = "Select personName from Person";
			ResultSet rs = stmt.executeQuery(quesry1);

			while (rs.next()) {
				if (rs.getString(1).equals(name)) {
					flag = 1;
				}
			}

			if (flag == 0) {

				throw new PersonNotFoundException();

			}

			if (flag == 1) {
				System.out.println("Already exists");

			}

			sc.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersonNotFoundException e) {
			// TODO Auto-generated catch block

			try {
				stmt = con.createStatement();
				System.out.println("New entry");

				System.out.println("Enter id: ");
				int id = sc.nextInt();

				System.out.println("Enter phone number: ");
				int phone = sc.nextInt();
				String query = "insert into Person values(" + id + ", '" + name
						+ "', " + phone + ")";
				stmt.execute(query);
			} catch (SQLException ee) {
				// TODO Auto-generated catch block
				ee.printStackTrace();
			}
		}

	}

	public void generateBill(Connection con) {

		Statement stmt;
		float bill = 0;

		System.out.println(map);

		for (Map.Entry<String, ArrayList<String>> t : map.entrySet()) {
			// System.out.println("hello");

			ArrayList<String> a = new ArrayList<String>();

			// for (int i = 0; i < map.size(); i++) {

			if (t.getKey().equals("David")) {
				// System.out.println("hey");

				a = t.getValue();

				for (String string : a) {
					String[] array = string.split(",");

					// String[] array1 = array[0].split(",");

					float quantity = Float.parseFloat(array[1]);
					System.out.println(quantity);

					try {
						stmt = con.createStatement();

						String quesry2 = "Select price from grocery where groceryName='"
								+ array[0] + "'";
						ResultSet rs = stmt.executeQuery(quesry2);

						while (rs.next()) {
							int i=Integer.parseInt(rs.getString(1));
							
							bill = bill + i*quantity;
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("bill for " + t.getKey() + " is "
						+ bill);


			}
		}
	}

	public static void main(String[] args) {

		Client c = new Client();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("driver loaded:");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/GroceryShop", "root", "root");

			// System.out.println("create connection");

			c.readfile("order.txt");
			c.CheckPerson(con);
			c.generateBill(con);
			// c.addPerson(con);

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersonNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
