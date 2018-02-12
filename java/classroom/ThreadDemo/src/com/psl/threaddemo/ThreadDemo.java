package com.psl.threaddemo;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (Thread.currentThread().getName().equals("one")) {
				System.out.println("one" + 3 * i);

			} else {
				System.out.println("two" + 5 * i);
			}

		}

	}

	public static void main(String[] args) {
		System.out.println("in main");

		ThreadDemo obj = new ThreadDemo(); // process of threads

		Thread t1 = new Thread(obj, "one"); // born state
		Thread t2 = new Thread(obj, "two");
		/*
		 * t1.setPriority(1); t2.setPriority(10);
		 */

		System.out.println("before start");

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("here");
		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("after start");

		System.out.println("end main");

		if (!t1.isAlive()) {
			t1 = new Thread(obj, "one");
			t1.start();
		}

	}

}
