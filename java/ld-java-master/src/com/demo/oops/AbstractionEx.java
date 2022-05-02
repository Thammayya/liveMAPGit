package com.demo.oops;

//Run-time polymorphism
public class AbstractionEx {
	public static void main(String[] args) {
		//the implementation is not known in advance
		VendingMachine vendingMachine = null;
//		Cannot instantiate the type VendingMachine
//		vendingMachine = new VendingMachine();
		// details of preparing coffeee are hidden in the coffee vending machine
//		vendingMachine = new CoffeeVendingMachine();
//		vendingMachine.getBeverage();
//		vendingMachine = new TeaVendingMachine();
//		vendingMachine.getBeverage();
		double random = Math.random();
		// only during runitme the implementation is decided / RUN-TIME POLYMORPHISM.
		System.err.println(random);
		if (random > 0.5) {
			vendingMachine = new CoffeeVendingMachine();
		} else {
			vendingMachine = new TeaVendingMachine();
		}
		vendingMachine.getBeverage();
		vendingMachine = new SpecialCoffeeVendingMachine();
		vendingMachine.getBeverage();
	}
}

//abstract ideas / education / transportation / service
// abstract
abstract class VendingMachine {
	// abstract method
	abstract void getBeverage();
}

class CoffeeVendingMachine extends VendingMachine {
	void getBeverage() {
		System.err.println("Add milk \n add coffeee powder \n add sugar");
	}
}

class SpecialCoffeeVendingMachine extends CoffeeVendingMachine {
	void getBeverage() {
		System.err.println("Add milk \n grind fresh roased coffee beans \n add sugar");
	}
}

class TeaVendingMachine extends VendingMachine {
	void getBeverage() {
		System.err.println("Add milk \n add tea \n add sugar");
	}
}