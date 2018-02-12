package com.psl.ques1;

import java.io.*;
import java.util.*;

public class CopyFiles {

	public static void main(String[] args) {

		/*
		 * File tempFile = new File(args[0]); boolean exists =
		 * tempFile.exists();
		 * 
		 * File tempFile1 = new File(args[1]); boolean exist =
		 * tempFile1.exists();
		 */
		Scanner s = new Scanner(System.in);

		try {
			FileInputStream fr = new FileInputStream(args[0]);

			try {
				FileOutputStream fw = new FileOutputStream(args[1]);

				System.out.println("Do you want to overwrite the file??");
				String str = s.next();

				if (str.equals("yes")) {

					try {

						// FileReader fr = new FileReader(args[0]);
						// FileWriter fw = new FileWriter(args[1]);

						int c;
						while ((c = fr.read()) != -1) {
							fw.write(c);
						}
						fr.close();
						fw.close();
						System.out.println("Successful");

					} catch (IOException e) {
						System.out.println(e);
					}

				} else {
					System.out.println("File contents were not copied");
				}

			}

			catch (IOException e) {
				System.out.println(e);
			}

		} catch (IOException e) {
			System.out.println("Source file doesnt exist");
		}

	}
}
