package com.psl.ques1;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		double d = Math.random() * 299;
		long val = (long) d;

		try {
			Thread.sleep(val);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Thread.currentThread().getName().equals("one")) {
			System.out.println(Thread.currentThread().getName()
					+ " sleep time: " + val);

		} else {
			System.out.println(Thread.currentThread().getName()
					+ " sleep time: " + val);
		}

	}

	public static void main(String[] args) {

		Thread1 obj = new Thread1();
		Thread t1 = new Thread(obj, "one");
		Thread t2 = new Thread(obj, "two");

		t1.start();
		t2.start();
	}

}
