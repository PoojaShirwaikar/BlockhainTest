package com.psl.ques2;

import java.util.Hashtable;
import java.util.Scanner;

public class Product {

	String productid, ProductName;
	Hashtable<String, String> ht = new Hashtable<String, String>();

	void addProducts(String key, String value) {
		ht.put(key, value);

	}

	void searchProducts(String key) {

		boolean b = ht.containsKey(key);
		if (b)
			System.out.println("Product Found ");
		else
			System.out.println("Product Not Found ");
	}

	void deleteProducts(String key) {
		
		boolean b = ht.containsKey(key);
		if(b){
			
			ht.remove(key);
			System.out.println("Product deleted");
			displayProducts();
		}
		else
		{
			System.out.println("Product not found");
		}
		
		

	}

	void displayProducts() {
		System.out.println("Products in hash table are: ");
		System.out.println(ht);

	}

	public static void main(String[] args) {

		String key = null;
		String key1 = null;
		String key2 = null;
		String value = null;
		Product p = new Product();

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter product id of product " + (i + 1));
			key = s.next();
			System.out.println("Enter product name of product " + (i + 1));
			value = s.next();
			p.addProducts(key, value);

		}

		p.displayProducts();

		System.out
				.println("Enter Product key you want to search in hash table: ");
		key1 = s.next();
		p.searchProducts(key1);

		System.out
				.println("Enter Product key you want to delete in hash table: ");
		key2 = s.next();
		p.deleteProducts(key2);

		s.close();

	}

}
