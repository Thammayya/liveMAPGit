package com.demo.oops;
// IP create your favourite fruits
public class ClassObjectEx {
	public static void main(String[] args) {
		// declare
		Fruit strawBerryFruit;
		// instantiate
		strawBerryFruit = new Fruit();
		// assign values
		strawBerryFruit.name = "Strawberry";
		strawBerryFruit.color = "red";
		strawBerryFruit.cost = 100.50f;
		strawBerryFruit.readyToEat = true;
		// access the fruit
		strawBerryFruit.showFruitDetails();
	}
}

class Fruit {
//	properties / fields / attributes / variables
	public String name;
	public String color;
	public float cost;
	public boolean readyToEat;
// methods / functions / routines / operations

	public void showFruitDetails() {
		System.err.println("Name " + name + "\t" + " Color : " + color + "\t" + cost + "\t" + readyToEat + "\t");
		if(readyToEat == true) {
			System.err.println("Ready to Eat....");
		}
		else {
			System.out.println("Eat after 2 days.....");
		}
	}
}