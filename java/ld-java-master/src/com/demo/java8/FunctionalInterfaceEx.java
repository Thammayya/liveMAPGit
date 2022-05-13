package com.demo.java8;

public interface FunctionalInterfaceEx {

}
// annotation / meta-data / attach functionality without modifying code / only on abstract method / used for lambdas
//@FunctionalInterface / java 8
// Invalid '@FunctionalInterface' annotation; DebitCard is not a functional interface
//interface DebitCard {
//	// default : public and abstract
////	public abstract void withdraw();
////	public abstract void checkBalance();
//	 void withdraw();
//	 void checkBalance(); 
//	}

@FunctionalInterface
interface DebitCard {
	void withdraw();
}