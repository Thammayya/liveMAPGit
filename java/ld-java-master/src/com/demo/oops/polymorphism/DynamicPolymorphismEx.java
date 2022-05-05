package com.demo.oops.polymorphism;
public class DynamicPolymorphismEx {
	public static void main(String[] args) {
		// reference for abstract class
		Account account = null;
		// Cannot instantiate the type Account
//		account = new Account();
		account = new SavingsAccount();
		account.withdraw();
//		The method openFD() is undefined for the type Account
//		account.openFD();
	}
}
// represent abstract entities / used for inheritance
 abstract class Account {
	// abstact methods / no body / should be overridden
	public abstract void withdraw();
	public abstract void deposit() ;
	public abstract void transfer();
	// concrete method / body
	public void getBalance() {
		System.err.println("display balance");
	}
}

interface DebitCard {
	// default / public & abstract
	public void withdraw();
}

class SavingsAccount extends Account{

	@Override
	public void withdraw() {
	System.err.println("withdraw cash");
	}

	@Override
	public void deposit() {
		System.err.println("deposit cash in bank");
	}
//	The method openFD() of type SavingsAccount must override or implement a supertype method
//	@Override
	public void openFD() {
		System.err.println("open fixed deposit in bank");
	}

	@Override
	public void transfer() {
		System.err.println("transfer amount going to the bank");
	}
}

