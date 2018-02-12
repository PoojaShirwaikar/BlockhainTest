package com.psl.ques3;

public class PriorityThread implements Runnable{

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("one")) {
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());

		} else {
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		}
		
	}

	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());

		PriorityThread obj = new PriorityThread();
		Thread t1 = new Thread(obj, "one");
		t1.setPriority(8);
		
		Thread t2 = new Thread(obj, "two");
		t2.setPriority(4);

		t2.setName("MyThread");
		t2.setPriority(2);

		
		Thread t3 = new Thread(obj, "three");
		t3.setPriority(2);


		t1.start();
		t2.start();
		t3.start();
	}

}
