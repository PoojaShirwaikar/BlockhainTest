package com.psl.ques2;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class Files {

	static Scanner s = new Scanner(System.in);
	static String str;

	public static void main(String[] args) {
		File f = null;
		FileOutputStream fw = null;
		FileInputStream fis = null;
		BufferedReader br = null;

		System.out.println("enter a string:");
		str = s.nextLine();

		try {
			f = new File("io.txt");
			if (f.exists()) {
				System.out.println("file exists");
			} else {

				f.createNewFile();

			}

			fw = new FileOutputStream(f);
			byte b[] = str.getBytes();

			fw.write(b);
			fw.close();

			fis = new FileInputStream(f);

			br = new BufferedReader(new InputStreamReader(fis));
			String s = br.readLine();

			System.out.print("Contents of file are: ");
			System.out.print(s);
			br.close();
			fis.close();

			long l = f.length();
			System.out.println("\nLength of file: " + l + "  bytes");

			if (f.delete()) {
				System.out.println("file deleted successfully!");
			} else {
				System.out.println("file couldnt be delted");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
