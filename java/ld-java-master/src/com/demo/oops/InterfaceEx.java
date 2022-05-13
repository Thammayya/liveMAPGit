package com.demo.oops;

// iterfaces - the highest form of abstraction
public class InterfaceEx {
	public static void main(String[] args) {

//		useSavingsAccount();		
//		useNetBanking();	
		// IP use DebitCard
		useDebitCard();
	}

	private static void useSavingsAccount() {
		SavingsAccount savingsAccount = null;
		savingsAccount = new SavingsAccount();
		// at the bank
		savingsAccount.withdraw();
		savingsAccount.fundsTransfer();
		savingsAccount.onlinePayments();
		savingsAccount.checkBalance();
		savingsAccount.changeBranch();
	}

	private static void useNetBanking() {
		NetBanking netBanking = null;
//		Cannot instantiate the type NetBanking
//		netBanking = new NetBanking();
		netBanking = new SavingsAccount();
		netBanking.checkBalance();
		netBanking.fundsTransfer();
		netBanking.onlinePayments();
//		The method withdraw() is undefined for the type NetBanking
//		netBanking.withdraw();
	}

	private static void useDebitCard() {
		DebitCard debitCard = new SavingsAccount();
		debitCard.withdraw();
		debitCard.checkBalance();
	}
}

interface NetBanking {
// Abstract methods do not specify a body
//public void fundsTransfer() {
//	}
	public void fundsTransfer();

	public void onlinePayments();

	public void checkBalance();
}

// java 7
interface DebitCard {
	// default : public and abstract
//	public abstract void withdraw();
//	public abstract void checkBalance();
	void withdraw();

	void checkBalance();
}

// Overriding is redefining the method in derived class to add specialized functionality
// Class can implement more than one interface
class SavingsAccount implements NetBanking, DebitCard {
	@Override
	public void fundsTransfer() {
		System.err.println("funds transfer");
	}

	@Override
	public void onlinePayments() {
		System.err.println("online payments");
	}

	@Override
	public void checkBalance() {
		System.err.println("check balance");
	}

	@Override
	public void withdraw() {
		System.err.println("withdraw");
	}

	public void changeBranch() {
		System.err.println("Change Branch");
	}
}
