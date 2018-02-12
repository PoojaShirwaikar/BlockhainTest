package com.psl.serialise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializtionDemo {
	
	public static void main(String[] args) {
		
		
		File f= new File("test.ser");
		
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
		
		
		try {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois= new ObjectInputStream(fis);
			
			Employee e = (Employee) ois.readObject();
			
		
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
