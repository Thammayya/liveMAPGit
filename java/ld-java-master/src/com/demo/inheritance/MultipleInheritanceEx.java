package com.demo.inheritance;

public class MultipleInheritanceEx {
	public static void main(String[] args) {
		Derived derived = new Derived();
		System.out.println(derived.baseVar);
		derived.baseMethod();

	}
}

class Base3 {
	// derived class gets a copy of the fields as well as the methods
	public String baseVar = "base 3 variable";

	public void baseMethod() {
		System.err.println("base 3 method");
	}
}

class Base4 {
	// derived class gets a copy of the fields as well as the methods
	public String baseVar = "base 4 variable";

	public void baseMethod() {
		System.err.println("base 4 method");
	}
}

// no syntax for multiple inheritance
//class Derived3 extends Base3, Base4{
//class Derived3 extends Base3 extends Base4{
//}