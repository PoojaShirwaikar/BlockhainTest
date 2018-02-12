package com.psl.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(3, "Vibhuti");
		map.put(1, "Pooja");
		map.put(2, "Sampat");
		map.put(3, "Nidhi");
		map.put(4, "Nidhi");
		map.put(5, "Hazia");
		
		System.out.println(map);
		
		System.out.println(map.get(3));
		
		Iterator it = map.keySet().iterator();
		
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			
			System.out.println(i+map.get(i));
			
		}
		
		Iterator it1 = map.entrySet().iterator();
		
		while (it1.hasNext()) {
			System.out.println("entry "+it1.next());
			
		}
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
			
		}
		

	}

}
