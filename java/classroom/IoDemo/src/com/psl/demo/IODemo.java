package com.psl.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class IODemo {

	public static void main(String[] args) {
		
		File f= new File("test.txt");
		
		
		if(f.exists()){
			System.out.println("file exists");
		}
		else
		{
			System.out.println("file doesnt exist");
			
			try {
				f.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		String str="writing into a file....";
		FileOutputStream fos=null;
		
		byte b[]= str.getBytes();
		
		try {
			 fos = new FileOutputStream(f);
			fos.write(b);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
		//	fos.flush();
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		FileInputStream fis =null;
		
		
		try {
			fis =new FileInputStream(f);
			
			
			
			Scanner sc=new Scanner(f);
			System.out.println(sc.next());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String s=br.readLine();
			System.out.println(s);
		/*	int i=0;
			
			while((i=fis.read())!= -1)
			{
				System.out.print((char)i);
			}*/
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		
	}
	
	
}
