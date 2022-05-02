package com.demo.inheritance;

public class HybridInheritanceEx {
	public static void main(String[] args) {
	}
}

class Base44 {
	// derived class gets a copy of the fields as well as the methods
	public String baseVar = "base variable";

	public void baseMethod() {
		System.err.println("base method");
	}
}

class Derived5 extends Base44 {
	public String derivedVar = "derived variable";

	public void derivedMethod() {
		System.err.println("derived method");
	}
}

class Derived6 extends Derived5 {
	public String derivedVar2 = "derived variable";

	public void derivedMethod2() {
		System.err.println("derived method");
	}
}
class Derived7 extends Derived5 {
	public String derivedVar2 = "derived variable";

	public void derivedMethod2() {
		System.err.println("derived method");
	}
}