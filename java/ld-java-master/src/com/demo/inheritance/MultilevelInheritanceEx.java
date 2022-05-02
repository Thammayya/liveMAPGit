package com.demo.inheritance;

public class MultilevelInheritanceEx {
	public static void main(String[] args) {
		Derived2 derived2 = new Derived2();
		System.err.println(derived2.baseVar);
		derived2.baseMethod();
		System.err.println(derived2.derivedVar);
		derived2.derivedMethod();
		System.err.println(derived2.derivedVar2);
		derived2.derivedMethod2();
	}
}

class Base1 {
	// derived class gets a copy of the fields as well as the methods
	public String baseVar = "base variable";

	public void baseMethod() {
		System.err.println("base method");
	}
}

class Derived1 extends Base1 {
	public String derivedVar = "derived variable 1";

	public void derivedMethod() {
		System.err.println("derived method 1");
	}
}

class Derived2 extends Derived1 {
	public String derivedVar2 = "derived variable 2";

	public void derivedMethod2() {
		System.err.println("derived method 2");
	}
}