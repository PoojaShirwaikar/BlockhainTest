package com.psl.ques1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		File f1 = new File("f1.txt");
		if (!f1.exists()) {
			System.out.println("file doesnt exist");

			try {
				f1.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		System.out.println("Absolute path: "+f1.getAbsoluteFile());
		System.out.println("IS READABLE "+f1.canRead());
		System.out.println("IS READABLE "+f1.canWrite());
		
		
		FileWriter fw;
		BufferedWriter bw;
		
		try {
			System.out.println("Enter a string");
			String a= sc.next();
			
			 fw = new FileWriter(f1);
			 bw = new BufferedWriter(fw);
			bw.write(a);
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Enter another string");
			String a= sc.next();
			
			 fw = new FileWriter(f1,true);
			 bw = new BufferedWriter(fw);
			bw.write(a);
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
