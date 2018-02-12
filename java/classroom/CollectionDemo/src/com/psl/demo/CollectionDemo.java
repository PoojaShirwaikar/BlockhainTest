package com.psl.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("Prabhav");
		obj.add("Nishit");

		obj.add("Namrata");
		obj.add("Madhushree");

		obj.add("Lerisa");
		obj.add("sruthi");
		obj.add("Prabhav");
		obj.add("Nishit");

		obj.add("Namrata");
		
		System.out.println(obj);
		
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		
		obj.remove("Prabhav");
		System.out.println(obj);

		
		for (String string : obj) {
			System.out.println(string);
		}
		
		
		Iterator<String> it=obj.iterator();
		
		String str = null;
		
		while (it.hasNext()) {
			str= it.next();
			
			if(str.equals("Prabhav")) {
				it.remove();

				
			}
			System.out.println(" after  "+obj);
			
			/*
			 * System.out.println("It-->"+str);
			 * 
			 * if(str.equals("Prabhav")) obj.remove("Prabhav");
			 */
			
		}
		

		
		
	}

}
