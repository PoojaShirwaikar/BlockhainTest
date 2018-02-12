package com.psl.ques8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProdCon implements Runnable {
	int j = 0;
	boolean isflag = true;

	LinkedList<Integer> list = new LinkedList<Integer>();

	public void produce() {
		list.add(j);
	}

	public void consume() {
		System.out.println("Removed: "+list.removeFirst());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {

			for (int i = 0; i < 10; i++) {

				if (Thread.currentThread().getName().equals("Producer")) {
					

					while (!isflag) {
						// synchronized (this) {

						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// }
					}
					j++;
					produce();
					System.out.println(list);
					isflag = false;
					notify();

				} else {
					while (isflag) {
						// synchronized (this) {

						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// }
					}
					consume();
					isflag = true;
					notify();
					//System.out.println(list);

				}
			}
		}

	}

	public static void main(String[] args) {
		ProdCon pc = new ProdCon();

		Thread t = new Thread(pc, "Producer");
		Thread t1 = new Thread(pc, "Consumer");

		t.start();
		t1.start();

	}

}
