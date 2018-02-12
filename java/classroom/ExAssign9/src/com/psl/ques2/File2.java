package com.psl.ques2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File2 {
	static int cid;
	static String name;
	static int isdcall;
	static int isdmin;
	static int stdcall;
	static int stdmin;
	static int localcall;
	static float localmin;

	public static void calculatebill()
	{
		System.out.println("customer: "+name);
		
		double bill = 0;
		bill=((isdcall*isdmin)/60f) +((stdcall*stdmin)/60f)+((localcall*localmin)/60f);
		System.out.println("Bill is: "+bill);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f1 = new File("Billing.csv");

		try {
			BufferedReader br = new BufferedReader(new FileReader(f1));

			
			String str = null;
			str = br.readLine();
			while ((str = br.readLine()) != null) {
				String[] a = str.split(",");
				System.out.println(str);

				cid = Integer.parseInt(a[0]);
				name = a[1];
				isdcall = Integer.parseInt(a[2]);
				isdmin = Integer.parseInt(a[3]);
				stdcall = Integer.parseInt(a[4]);
				stdmin = Integer.parseInt(a[5]);
				localcall = Integer.parseInt(a[6]);
				localmin = Float.parseFloat(a[7]);
				
				calculatebill();

			}
			
			
		

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
