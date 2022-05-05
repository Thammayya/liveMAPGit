// implement digital wallet account
package com.demo.oops.polymorphism;
public class DynamicPolymorphismInterfaceEx {
	public static void main(String[] args) {
		// reference for abstract class
//		Account account = null;
		// Cannot instantiate the type Account
//		account = new Account();
//		account = new SavingsAccount();
//		account.withdraw();
//		The method openFD() is undefined for the type Account
//		account.openFD();
		
//		System.err.println("DW");
//		account = new DigitalWallet();
//		account.deposit();
//		account.withdraw();
//		account.getBalance();
//		The method billPayments() is undefined for the type Account
//		account.billPayments();
		
		DebitCard debitCard = null;
//		Cannot instantiate the type DebitCard
//		debitCard = new DebitCard();
		debitCard = new SavingsAccount1();
		debitCard.withdraw();
		debitCard.getBalance();
	}
}

interface DebitCard {
	// default / public & abstract
	public void withdraw();
//	Abstract methods do not specify a body
//	public void getBalance() {
//		System.err.println("display balance");
//	}
	public void getBalance();
}

class SavingsAccount1 implements DebitCard{


	public void withdraw() {
	System.err.println("withdraw cash");
	}


	public void deposit() {
		System.err.println("deposit cash in bank");
	}
//	The method openFD() of type SavingsAccount must override or implement a supertype method
//
	public void openFD() {
		System.err.println("open fixed deposit in bank");
	}


	public void transfer() {
		System.err.println("transfer amount going to the bank");
	}


	@Override
	public void getBalance() {
		System.err.println("display savings account balance");
		
	}
}


