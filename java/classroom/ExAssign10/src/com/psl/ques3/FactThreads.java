package com.psl.ques3;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FactThreads implements Runnable {

	public void factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is " + fact);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean isflag = true;
	//	int i = 0;
		String str = null ;
		File f = new File("Numbers.txt");

		try (FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);) {

			synchronized (this) {
				while ((str=br.readLine()) != null) {

					if (Thread.currentThread().getName().equals("one")) {

						if (!isflag) {

							wait();

						}
						System.out.println(str);
						isflag = false;
						notify();

					} else {
						if (isflag) {

							wait();

						}
						factorial(Integer.parseInt(str));
						isflag = true;
						notify();
						// System.out.println(list);

					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void main(String[] args) {
		FactThreads ft = new FactThreads();
		Thread t1 = new Thread(ft, "one");
		Thread t2 = new Thread(ft, "two");
		t1.start();
		t2.start();

	}

}
