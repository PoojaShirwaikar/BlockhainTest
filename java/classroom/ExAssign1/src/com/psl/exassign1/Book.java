package com.psl.exassign1;

public class Book {
	int book_id;
	String book_name;
	String book_author;
	double book_price;
	BookCategory book_category;

	public Book(String str[])
	{
		this.book_id = Integer.parseInt(str[0]);
		this.book_name = str[1];
		this.book_author = str[2];
		this.book_price = Double.parseDouble(str[3]);
		this.book_category = BookCategory.valueOf(str[4].toUpperCase());

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "Book id: "+book_id+" Book name: "+book_name+" Book Author: "+book_author+" Book Price: "+book_price+" Book category: "+book_category;
		
	}

}
