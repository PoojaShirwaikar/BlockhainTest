package com.psl.ques3;

import java.util.ArrayDeque;
import java.util.Deque;

import com.psl.ques1.Cities;

public class Arraydq {

	public static void main(String[] args) {
		Deque<Cities> d = new ArrayDeque<Cities>();
		

		Cities c = new Cities(1, "margao", "goa");
		Cities c1 = new Cities(2, "panjim", "goa");
		Cities c2 = new Cities(3, "pune", "maharashtra");
		Cities c3 = new Cities(0, null, null); //null cant be inserted in arraydeque

		
		d.add(c);
		d.add(c1);
		d.add(c2);
		d.add(c3);
		System.out.println(d);
		
		System.out.println(d.getFirst());
		System.out.println(d.removeLast());
		
		
	}
}
