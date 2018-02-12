package com.psl.demo;

public class OuterClass {
	private int a = 10;

	class InnerClass {

		public void display() {
			// TODO Auto-generated method stub
			System.out.println("inner display " + a);
		}
	}

	public void display() {
		// TODO Auto-generated method stub

		System.out.println("outer display");

		// InnerClass iobj = new InnerClass();
		// iobj.display();

	}

	public static void main(String[] args) {
		// simple inner class
		/*
		 * OuterClass obj = new OuterClass(); obj.display();
		 * OuterClass.InnerClass iobj = obj.new InnerClass(); iobj.display();
		 */

		// static inner class
		// OuterClass.InnerClass iobj = new OuterClass.InnerClass();

		// method local inner class: obj created inside method
		/*
		 * OuterClass obj = new OuterClass(); obj.display();
		 */

		// Anonymous inner class

		OuterClass obj = new OuterClass(){
		@Override
		public void display() {
			// TODO Auto-generated method stub
				System.out.println("anonymous");
			}
		};
		 obj.display();
		 
		 
		 MyInterface iobj = new MyInterface(){
			 @Override
			public void MyMethod() {
				// TODO Auto-generated method stub
				System.out.println("interface");
			}
		 };
		 }
		 
	}

