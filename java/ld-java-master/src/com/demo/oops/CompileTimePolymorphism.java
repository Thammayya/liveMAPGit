package com.demo.oops;

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		CoffeeVendingMachine2 coffeeVendingMachine2 = new CoffeeVendingMachine2();
		coffeeVendingMachine2.getCoffee();
		coffeeVendingMachine2.getCoffee("sugar free");
		coffeeVendingMachine2.getCoffee("sugar free", "hot" );
	}

}

class CoffeeVendingMachine2  {
	// overloaded methods [static polymorphism]
	// overloading : multiple functions with same name, but different arguments.
	void getCoffee() {
		System.err.println("Coffee for you");
	}
	public void getCoffee(String chocieOfSugar, String hotOrCold) {
		System.err.println(chocieOfSugar + " Coffee" + " served " + hotOrCold);
	}
	void getCoffee(String chocieOfSugar) {
		System.err.println(chocieOfSugar + " Coffee");
	}
}