package com.psl.demo;


interface MyInterface{
	public int operations(int a, int b);
	
}


public class LambdaDemo {

	public static void main(String[] args) {
		
		
		MyInterface obj = new MyInterface() {
			@Override
			public int operations(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		obj.operations(10, 20);
		
		MyInterface obj1 = new MyInterface() {
			@Override
			public int operations(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		MyInterface my= (int a, int b)->a+b;
		MyInterface my1= (a, b)->a*b;
		MyInterface my2= (int a, int b)->{ System.out.println("hello"); return a*b; };

		

		
		
		my.operations(20, 20);

		
		
		
	}

}
