package com.psl.ques4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Client {
	
	public void sortValues(TreeMap<Integer, Cities> map) {
		Set<Cities> str = new TreeSet<Cities>(new SortByValue());		
		str.addAll(map.values());
		System.out.println("sorting by values");
		System.out.println(str);
	}
	
	public void leastgreaterthan5(TreeMap<Integer, Cities> map) {
		System.out.println("value of least key greater than or equal to key 5");
		System.out.println(map.floorEntry(5));

	}

	public void greaterthan3(TreeMap<Integer, Cities> map) {
		System.out.println("value of keys are greater than or equal to 3");
		System.out.println(map.ceilingEntry(3));

	}

	public static void main(String[] args) {
		Client cl = new Client();
		TreeMap<Integer, Cities> map = new TreeMap<Integer, Cities>(new MyCopr());
		SortedMap<Integer, Cities> map1 = new TreeMap<Integer, Cities>();

		Cities c = new Cities(6, "margao");
		Cities c1 = new Cities(4, "panjim");
		Cities c2 = new Cities(3, "pune");
		Cities c3 = new Cities(2, "kolhapur");
		Cities c4 = new Cities(7, "mumbai");

		map.put(c2.cityId, c2);
		map.put(c1.cityId, c1);
		map.put(c.cityId, c);
		map.put(c3.cityId, c3);
		map.put(c4.cityId, c4);

		System.out.println("Map in Descending order: ");
		System.out.println(map);
		
		
		cl.leastgreaterthan5(map);
		cl.greaterthan3(map);
		
		
		map1 = map.subMap(5, 1);  //including 2 and not including 6
		System.out.println(map1);
		
		
		cl.sortValues(map);

		
		

	}

}
