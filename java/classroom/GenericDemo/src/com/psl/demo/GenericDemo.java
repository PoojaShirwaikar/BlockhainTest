package com.psl.demo;

public class GenericDemo<T> {

	private T obj;

	public GenericDemo(T obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public static void main(String[] args) {

		/*
		 * GenericDemo obj1 = new GenericDemo(new String("persistent"));
		 * GenericDemo obj2 = new GenericDemo(new Integer(10));
		 * 
		 * String str=(String) obj1.getObj(); //typecasting
		 * System.out.println(str);
		 * 
		 * String str1=(String) obj2.getObj(); //class cast exception
		 * (typecasting only in family possible) System.out.println(str1);
		 */

		GenericDemo<String> obj1 = new GenericDemo<String>("persistent");
		GenericDemo<Integer> obj2 = new GenericDemo<Integer>(10);

		String str = obj1.getObj(); // no need of typecasting
		System.out.println(str);

		Integer str1 = obj2.getObj(); // no class cast exception
		System.out.println(str1);
	}

}
