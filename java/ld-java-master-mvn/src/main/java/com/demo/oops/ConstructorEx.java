package com.demo.oops;

// IP is work on two products of your choice.
public class ConstructorEx {
	public static void main(String[] args) {
		// assign values through fields
		Product product3 = new Product();
		product3.productId = "P03";
		product3.productName = "NgBook";
		product3.price = 500;
		product3.quantity = 200;
		product3.getProduct();

		// default constructor
		Product product = new Product();
		product.getProduct();

		// parameterized constructor
		Product product2 = new Product("P02", "Java", 50.5f, 5);
		product2.getProduct();
	}

}

class Product {
	// instance variable
	public String productId;
	public String productName;
	public float price;
	public int quantity;

	// default cons
	public Product() {
		productId = "";
		productName = "";
		price = 0.0f;
		quantity = 0;
	}
//	public Product() {
//		productId = "P01";
//		productName = "SWW";
//		price = 22.5f;
//		quantity = 10;
//	}

	public Product(String productId, String productName, float price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	// parameterized constructor

	public void getProduct() {
		System.err.println("\nProduct ID " + productId);
		System.err.println("Name " + productName);
		System.err.println("Price " + price);
		System.err.println("Quantity " + quantity);
	}
}
