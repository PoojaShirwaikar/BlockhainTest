package com.psl.exassign1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
	List<Book> obj = new ArrayList<Book>();

	public void store() {

		File f = new File("bookdetails.csv");

		FileInputStream fr = null;
		BufferedReader br = null;
		String s;
		Book b = null;

		try {
			fr = new FileInputStream(f);
			br = new BufferedReader(new InputStreamReader(fr));

			while ((s = br.readLine()) != null) {
				String[] str = s.split(",");
				b = new Book(str);
				obj.add(b);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void display() {
		for (Book book : obj) {
			System.out.println(book);
		}

	}

	public List<Book> search(String str) {
		Iterator<Book> i1 = obj.iterator();
		BookCategory b = BookCategory.valueOf(str.toUpperCase());
		List<Book> obj1 = new ArrayList<Book>();

		System.out.println("\nBooks for category" + str);

		while (i1.hasNext()) {
			Book c = i1.next();
			if (b == (c.book_category)) {
				obj1.add(c);
			}
		}

		return obj1;

	}

	public static void main(String[] args) {
		BookList b1 = new BookList();
		List<Book> obj2 = new ArrayList<Book>();

		b1.store();
		b1.display();
		obj2 = b1.search("Computer");

		Iterator<Book> i3 = obj2.iterator();

		while (i3.hasNext()) {
			Book c = i3.next();

			System.out.println(c);

		}

	}

}
