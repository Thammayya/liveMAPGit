package com.demo.collections;

// IP create model
// model / properties
// abstract datatypes / user defined classes
//public class Book extends Object{
public class Book {
	// encapsulation / properties - private variable with getter (or/and) setter.
	private String ISBN;
	private String authorName;
	private float price;

	public Book(String iSBN, String authorName, float price) {
		// Object class constructor
//		super();
		ISBN = iSBN;
		this.authorName = authorName;
		this.price = price;
	}

	public Book() {

	}

	// setter
	public void setISBN(String ISBN) {
		if (ISBN.length() != 14) {
			System.err.println("ISBN to be 14 characters");
		} else {
			this.ISBN = ISBN;
		}
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	// setter for price
	public void setPrice(float price) {
		if (price < 0) {
			System.err.println("Invalide price");
		} else {
			this.price = price;
		}
	}

	// getter for price
	public float getPrice() {
		return this.price;
	}

	public String getISBN() {
		return "ISBN-13:" + this.ISBN;
	}
}
