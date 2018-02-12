package com.psl.ques6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class AllCollections {

	public static <T> void print(Collection<T> obj) {
		for (T t : obj) {
			System.out.println(t);

		}

	}

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("hello set");
		print(set);
		
		
		List<String> list = new ArrayList<String>();
		list.add("hello list");
		print(list);
		
		

	}

}
