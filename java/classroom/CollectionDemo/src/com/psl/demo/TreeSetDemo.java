package com.psl.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.psl.sorting.Employee;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		
		Employee e1 = new Employee(102, 800000, "Spiderman");
		Employee e2 = new Employee(101, 70000, "Batman");
		Employee e3 = new Employee(103, 60000, "James Bond");
		Employee e4 = new Employee(101, 70000, "Batman");
		
		Set<Employee> obj = new HashSet<Employee>();

		obj.add(e1);
		obj.add(e2);

		obj.add(e3);
		obj.add(e4);
		/*obj.add("Madhushree");

		obj.add("Lerisa");
		obj.add("sruthi");
		obj.add("Prabhav");
		obj.add("Nishit");

		obj.add("Namrata");
		*/
		
		//obj.remove("  ");
		
		System.out.println(obj);
		
		/*for (Employee string : obj) {
			System.out.println(string);
			
		}
		
		*/

		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e4));

		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());

		
		
		
	//	Iterator<Employee> it=obj.iterator();
		
		/*Employee str = null;
		
		while (it.hasNext()) {
			str= it.next();
			
			if(str.equals("Prabhav")) {
				it.remove();

				
			}
			System.out.println(" after  "+obj);
		}*/
	}
}
