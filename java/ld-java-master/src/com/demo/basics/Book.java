package com.demo.basics;

// IP create model
// model / properties
// abstract datatypes / user defined classes
public class Book extends Object{
//public class Book {
	// encapsulation / properties - private variable with getter (or/and) setter.
	private String ISBN;
	private String authorName;
	private float price;

	//constructor / same name of class / no return type
	// default constructor / no parameters
	public Book() {
		ISBN = "ISBN1";
		authorName = "Unknown";
		price = 0.0f;
	}
	// parameterized constructor
	public Book(String iSBN, String authorName, float price) {
		ISBN = iSBN;
		this.authorName = authorName;
		this.price = price;
	}
	public String getISBN() {
		return ISBN;
	}
	public String getAuthorName() {
		return authorName;
	}
	public float getPrice() {
		return price;
	}
	@Override
		public String toString() {
			String bookString = ISBN + "\n" + authorName + "\n" + price;
			return bookString;
		}
}
