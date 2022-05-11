package com.demo.basics;



public class ToStringEx {
	public static void main(String[] args) {
		Book book = null;
		book = new  Book("123-1234567890", "Simon Sinek", 360f);
		System.out.println(book.getISBN());
		System.out.println(book.getAuthorName());
		System.out.println(book.getPrice());
		

		String bookToString = book.toString();
		System.err.println(bookToString);
		System.err.println(book);
	}
}
