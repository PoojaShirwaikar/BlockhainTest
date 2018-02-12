package com.psl.ques5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Map<String, Integer> map= new HashMap<String, Integer>();
		int key=0;		
		
		do{
			
			System.out.println("Enter 1. to Add new phone book entry");
			System.out.println("Enter 2. to Search Phone Number");
			System.out.println("Enter 3. to Quit.");
			 key=sc.nextInt();
		
			switch (key) {
			case 1:System.out.println("Enter name: ");
					String name =sc.next();
					System.out.println("Enter phone number: ");
					int num =sc.nextInt();
					map.put(name, num);

				break;

			case 2:System.out.println("Enter the name to search: ");
					String name1 =sc.next();
					if(map.containsKey(name1))
					{
						System.out.println("Phone number: ");
						System.out.println(map.get(name1));
					}

				break;

			}

		} while (key != 3);
		
		sc.close();

	}

}
