package com.demo.inheritance;

public class HierarchialInheritanceEx {
	public static void main(String[] args) {
		Derived22 derived22 = new Derived22();
		System.err.println(derived22.baseVar);
		derived22.baseMethod();
//		System.err.println(derived22.derivedVar);
//		derived22.derivedMethod();
		System.err.println(derived22.derivedVar2);
		derived22.derivedMethod2();
	}
}

class Base11 {
	// derived class gets a copy of the fields as well as the methods
	public String baseVar = "base variable";

	public void baseMethod() {
		System.err.println("base method");
	}
}

class Derived11 extends Base11 {
	public String derivedVar = "derived variable 1";

	public void derivedMethod() {
		System.err.println("derived method 1");
	}
}

class Derived22 extends Base11 {
	public String derivedVar2 = "derived variable 2";

	public void derivedMethod2() {
		System.err.println("derived method 2");
	}
}