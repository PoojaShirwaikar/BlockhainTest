package com.psl.ques2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileThread implements Runnable {
	public static void main(String[] args) {
		ReadFileThread ft = new ReadFileThread();
		Thread t1 = new Thread(ft, "one");
		Thread t2 = new Thread(ft, "two");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		File f1 = new File("file1.txt");
		File f2 = new File("file2.txt");

		if (Thread.currentThread().getName().equals("one")) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(f1));
				while (br.readLine() != null) {
					System.out.println(f1);
					Thread.sleep(2000);

				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			try {
				BufferedReader br = new BufferedReader(new FileReader(f2));
				while (br.readLine() != null) {
					System.out.println(f2);
					Thread.sleep(5000);

				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
