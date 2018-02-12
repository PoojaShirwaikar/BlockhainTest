package com.psl.demo;

public class SyncDemo implements Runnable {

	Account acc;

	public SyncDemo(Account acc) {
		// TODO Auto-generated constructor stub
		this.acc = acc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (Thread.currentThread().getName().equals("one")) {
				synchronized (acc) {
					deposit(10000);

				}
			} else {
				synchronized (acc) {
					withdraw(10000);

				}
			}
		}

	}

	private void withdraw(int i) {
		int ibal = acc.getBalance();
		int fbal = ibal - i;
		acc.setBalance(fbal);

		System.out.println("After withdrawal: " + acc.getBalance());
	}

	private void deposit(int i) {
		int ibal = acc.getBalance();
		int fbal = ibal + i;
		acc.setBalance(fbal);

		System.out.println("After deposit: " + acc.getBalance());
	}

	public static void main(String[] args) {

		Account acc = new Account(10000);

		SyncDemo obj = new SyncDemo(acc);
		Thread t1 = new Thread(obj, "one"); // born state
		Thread t2 = new Thread(obj, "two");

		t1.start();
		t2.start();

	}
}
