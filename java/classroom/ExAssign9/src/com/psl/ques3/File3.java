package com.psl.ques3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class File3 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter source");
		String source = s.next();
		System.out.println("Enter destination");
		String dest = s.next();

		try {
			FileInputStream fr = new FileInputStream(source);

			try {
				FileOutputStream fw = new FileOutputStream(dest);

				System.out.println("Do you want to overwrite the file??");
				String str = s.next();

				if (str.equals("yes")) {

					try {
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
