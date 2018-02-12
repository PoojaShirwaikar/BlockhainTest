package com.psl.demo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class WaitNotifyDemo extends JFrame implements Runnable {

	int gx = 10, rx = 10, bx = 10;

	public WaitNotifyDemo() {
		// TODO Auto-generated constructor stub

		setTitle("Let's Race...!! or stay Home...!!!");
		setVisible(true);
		setSize(800, 600);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				if (Thread.currentThread().getName().equals("green")) {

					gx++;
					Thread.sleep(20);

					if (gx == 400) {

						synchronized (this) {
							wait();

						}
					}

				} else if (Thread.currentThread().getName().equals("red")) {

					rx++;
					Thread.sleep(40);
					if (rx == 400) {

						synchronized (this) {
							wait();

						}
					}

				} else if (Thread.currentThread().getName().equals("blue")) {
					bx++;

					Thread.sleep(80);
					if (bx == 400) {

						synchronized (this) {
							notifyAll();
						}
					}

				}
				repaint();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

		super.paint(g);

		g.setColor(Color.GREEN);
		g.fillOval(gx, 150, 50, 50);

		g.setColor(Color.RED);
		g.fillOval(rx, 250, 50, 50);

		g.setColor(Color.BLUE);
		g.fillOval(bx, 350, 50, 50);
	}

	public static void main(String[] args) {
		WaitNotifyDemo obj = new WaitNotifyDemo();

		Thread t1 = new Thread(obj, "green");
		Thread t2 = new Thread(obj, "red");
		Thread t3 = new Thread(obj, "blue");

		t1.start();
		t2.start();
		t3.start();

	}

}
