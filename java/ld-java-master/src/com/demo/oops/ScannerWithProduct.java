package com.demo.oops;

import java.util.Scanner;

public class ScannerWithProduct {
	public static void main(String[] args) {
		Product1 product1 = new Product1();
		product1.getProduct();
	}
}

class Product1 {
	// instance variable
	public String productId;
	public String productName;
	public float price;
	public int quantity;

	// default cons
	public Product1() {
		// accept all fields
		this.productId = "P01";
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter Product Name");
		this.productName = scanner.nextLine();
		this.price = 50.25f;
		System.err.println("Enter Quantity ");
		String quantityString = scanner.nextLine();
		this.quantity = Integer.parseInt(quantityString);
	}

		public void getProduct() {
		System.err.println("\nProduct ID " + productId);
		System.err.println("Name " + productName);
		System.err.println("Price " + price);
		System.err.println("Quantity " + quantity);
	}
}