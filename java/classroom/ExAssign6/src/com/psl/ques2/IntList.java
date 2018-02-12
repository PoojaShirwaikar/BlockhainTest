package com.psl.ques2;

import java.util.Iterator;
import java.util.LinkedList;


public class IntList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		list.addFirst(5);
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		int s=list.getFirst();
		System.out.println(s);

	}
}
