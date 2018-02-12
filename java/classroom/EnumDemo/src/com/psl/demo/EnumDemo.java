package com.psl.demo;

public class EnumDemo {

	public static void main(String[] args) {
		System.out.println(Coffee.regular);
		
		Coffee c[]=Coffee.values();
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println(Coffee.small.getPrice());
	}
	
}
