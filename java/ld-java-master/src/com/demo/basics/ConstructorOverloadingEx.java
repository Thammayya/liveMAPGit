package com.demo.basics;

import com.demo.collections.Book;

public class ConstructorOverloadingEx {
public static void main(String[] args) {
//	Book book = null;
	Book book;
	// default constructor
	book = new Book();
	System.out.println(book.getISBN());
	System.out.println(book.getAuthorName());
	System.out.println(book.getPrice());
	
	// parameterized constructor
	Book book1 = null;
	book1 = new  Book("123-1234567890", "Simon Sinek", 360f);
	System.out.println(book1.getISBN());
	System.out.println(book1.getAuthorName());
	System.out.println(book1.getPrice());
}
}

