package com.psl.ques5;

public class UnsyncThread implements Runnable {

	public static class Counter {
		static int count = 0;

		public static void incrementCount() {
			count++;
		}
	}

	Counter c = new Counter();

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {

			Counter.incrementCount();

			if (Thread.currentThread().getName().equals("one")) {

				System.out.println(Thread.currentThread().getName() + " "
						+ Counter.count);

			} else {
				System.out.println(Thread.currentThread().getName() + " "
						+ Counter.count);
			}

		}

	}

	public static void main(String[] args) {
		UnsyncThread obj = new UnsyncThread();
		Thread t1 = new Thread(obj, "one");
		Thread t2 = new Thread(obj, "two");
		Thread t3 = new Thread(obj, "three");
		Thread t4 = new Thread(obj, "four");

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t4.start();
		try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
