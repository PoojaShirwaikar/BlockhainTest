package com.psl.ques5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchThread implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		String s11 = "how";
		String s21 = "are";
		String s31 = "you";
		String s41 = "world";
		File f = new File("search.txt");

		if (Thread.currentThread().getName().equals("one")) {

			try {
				Scanner s = new Scanner(System.in);
				s = new Scanner(f);
				while (s.hasNextLine()) {
					String str = s.nextLine();
					if (str.indexOf(s11) != -1) {

						System.out.println(Thread.currentThread().getName()+" word exists");
					}
				}
				s.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (Thread.currentThread().getName().equals("two")) {
			try {
				Scanner s2 = new Scanner(System.in);
				s2 = new Scanner(f);
				while (s2.hasNextLine()) {
					String str = s2.nextLine();
					if (str.indexOf(s21) != -1) {
						System.out.println(Thread.currentThread().getName()+" word exists");
					}
				}

				s2.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (Thread.currentThread().getName().equals("three")) {
			try {
				Scanner s3 = new Scanner(System.in);
				s3 = new Scanner(f);
				while (s3.hasNextLine()) {
					String str = s3.nextLine();
					if (str.indexOf(s31) != -1) {
						System.out.println(Thread.currentThread().getName()+" word exists");
					}
				}

				s3.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (Thread.currentThread().getName().equals("four")) {
			try {
				Scanner s4 = new Scanner(System.in);
				s4 = new Scanner(f);
				while (s4.hasNextLine()) {
					String str = s4.nextLine();
					if (str.indexOf(s41) != -1) {
						System.out.println(Thread.currentThread().getName()+" word exists");
					}
				}

				s4.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		SearchThread ft = new SearchThread();
		Thread t1 = new Thread(ft, "one");
		Thread t2 = new Thread(ft, "two");
		Thread t3 = new Thread(ft, "three");
		Thread t4 = new Thread(ft, "four");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
