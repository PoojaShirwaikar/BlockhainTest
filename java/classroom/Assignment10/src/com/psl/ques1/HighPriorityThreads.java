package com.psl.ques1;


public class HighPriorityThreads implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub

		if (Thread.currentThread().getName().equals("one")) {
			
			System.out.println(Thread.currentThread().getName() + " "
					+ Thread.currentThread().getPriority());

		} else {
			System.out.println(Thread.currentThread().getName() + " "
					+ Thread.currentThread().getPriority());
		}

	}

	public static void main(String[] args) {

		HighPriorityThreads obj = new HighPriorityThreads();
		Thread t1 = new Thread(obj, "one");
		Thread t2 = new Thread(obj, "two");

		t1.setPriority(10);
		t2.setPriority(1);

		t1.start();
		t2.start();

	}
}
