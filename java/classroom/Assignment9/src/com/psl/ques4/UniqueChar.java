package com.psl.ques4;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UniqueChar {
	static Map<String, Integer> map = new TreeMap<String, Integer>();
	static Set<Character> s = new HashSet<Character>();

	static int Unique(String str) {
		int count = 0;
		if (map.containsKey(str)) {
			System.out.println("checking in map");
			count = map.get(str);
		} else {
			System.out.println("Checking the count");

			for (int i = 0; i < str.length(); i++) {
				s.add(str.charAt(i));
			}

			count = s.size();
			map.put(str, count);
		}
		return count;

		/*
		 * int flag = 0;
		 * 
		 * for (int i = 0; i < str.length(); i++) { for (int j = i + 1; j <
		 * str.length(); j++) { flag = 1; if (str.charAt(i) == str.charAt(j))
		 * {// space also included flag = 0; break; } } if (flag == 1) count++;
		 * 
		 * }
		 */

		// System.out.println("Map: "+map.size());

	}

	public static void main(String[] args) {

		int count = Unique("hello");
		System.out.println("Frequency: " + count);

		count = Unique("hello");
		System.out.println("Frequency: " + count);
	}

}
