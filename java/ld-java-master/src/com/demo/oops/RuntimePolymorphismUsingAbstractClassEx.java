package com.demo.oops;

import java.util.Scanner;

//Run-time polymorphism
public class RuntimePolymorphismUsingAbstractClassEx {
	public static void main(String[] args) {
		//the implementation is not known in advance
		VendingMachine vendingMachine = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your preference : ");
		String choiceString = scanner.nextLine();
		if  ( choiceString.equals("coffee")) {
			vendingMachine = new CoffeeVendingMachine();
		} else {
			vendingMachine = new TeaVendingMachine();
		}
		vendingMachine.getBeverage();
//		vendingMachine = new SpecialCoffeeVendingMachine();
//		vendingMachine.getBeverage();
		
		CoffeeVendingMachine coffeeVendingMachine = null;
		coffeeVendingMachine = new CoffeeVendingMachine();
		coffeeVendingMachine.getBeverage();
	}
}

//abstract ideas / education / transportation / service
// abstract
abstract class VendingMachine1 {
	// abstract method
	abstract void getBeverage();
}

class CoffeeVendingMachine1 extends VendingMachine1 {
	void getBeverage() {
		System.err.println("Add milk \n add coffeee powder \n add sugar");
	}
}

class SpecialCoffeeVendingMachine1 extends CoffeeVendingMachine1 {
	void getBeverage() {
		System.err.println("Add milk \n grind fresh roased coffee beans \n add sugar");
	}
}

class TeaVendingMachine1 extends VendingMachine1 {
	void getBeverage() {
		System.err.println("Add milk \n add tea \n add sugar");
	}
}