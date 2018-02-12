package com.psl.ques3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Client {

	private static final String file = "City.txt";

	// int choice;

	static void getcity(Set<CityStateMap> c) {
		for (CityStateMap c1 : c) {
			System.out.println(c1.city);

		}
	}

	static void getstate(Set<CityStateMap> c) {

		Set<String> obj1 = new HashSet<String>();
		for (CityStateMap c1 : c) {

			obj1.add(c1.state);

		}
		System.out.println(obj1);

	}

	static Set<CityStateMap> addnew (Set<CityStateMap> c)
	{
		CityStateMap b =new CityStateMap("kolhapur", "maharashtra"); 
		c.add(b);
		return c;		
		
	}
	
	 
	 static void deletecityforstate(Set<CityStateMap> c, String s){
		 
		 Iterator<CityStateMap> itr = c.iterator();
		 
	        while (itr.hasNext())
	        {
	        	if(itr.next().state.equalsIgnoreCase(s))
				{
	        		itr.remove(); 
				}
	               
	        }
	 }
	
	static void cityforstate(Set<CityStateMap> c, String s)
	{
		for (CityStateMap c1 : c) {
			//System.out.println(c1.state);
			if(c1.state.equalsIgnoreCase(s))
			{
				System.out.println(c1.city);
			}
				
		}
		
	}
	

	public static void main(String[] args) {

		// Map<String, String> map = new TreeMap<String, String>();

		Set<CityStateMap> obj = new HashSet<CityStateMap>();
		// Set<String> obj1 = new HashSet<String>();

		// Iterator<CityStateMap> it = obj.iterator();

		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String currentLine;
			CityStateMap b = null;

			while ((currentLine = br.readLine()) != null) {

				String s[] = currentLine.split("\\s+");
				b = new CityStateMap(s[0], s[1]);

				
				obj.add(b);
			}

			System.out.println("the cities are: ");
			getcity(obj);

			System.out.println("\nthe states are: ");
			getstate(obj);
			
			System.out.println("\nthe cities in state GOA are: ");
			cityforstate(obj, "goa");
			
			
			System.out.println("\ndeleting cities of goa ");
			deletecityforstate(obj,"goa");
			
			System.out.println("add new entry:");
			obj=addnew(obj);
			
			System.out.println("after deleting");
			System.out.println(obj);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (Exception e) {

				e.printStackTrace();

			}
		}

	}
}
