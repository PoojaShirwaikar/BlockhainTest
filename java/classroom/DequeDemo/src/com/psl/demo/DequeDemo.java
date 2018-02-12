package com.psl.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();

		deque.add(40);
		deque.add(50);
		deque.add(80);
		deque.add(70);
		deque.add(20);
		deque.add(10);

		deque.addFirst(5);
		//System.out.println(deque.peekLast());
		

		Iterator<Integer> itr = deque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out
				.println("**************************************************");

		Iterator<Integer> itr1 = deque.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
