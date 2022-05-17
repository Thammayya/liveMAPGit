package com.demo.inheritance;

public class SingleInheritanceEx {
public static void main(String[] args) {
	Derived derived = new Derived();
	System.out.println(derived.baseVar);
	derived.baseMethod();
	
}
}

class Base {
	// derived class gets a copy of the fields as well as the methods
	public String baseVar = "base variable";
	public void baseMethod() {
		System.err.println("base method");
	}
}

class Derived extends Base{
	
}