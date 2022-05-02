package com.demo.oops;

public class UMLBook {
//	instance variables
	public String title;
	public String author;
	public String language;
	public float price;
	public boolean available;
	public String genreString;
//	assigning values
	public UMLBook( String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void calculateDiscount(String genreString) {
		if(genreString.equals("fiction"))
			System.err.println("10%");
		else {
			System.err.println("20%");
		}
	}
	public void open() {
	}

	public void read() {
	}

	public void bookmark(int page) {
	}

	public int getCurrentPage() {
		return 0;
	}

	public int close() {
		return 0;
	}

}
