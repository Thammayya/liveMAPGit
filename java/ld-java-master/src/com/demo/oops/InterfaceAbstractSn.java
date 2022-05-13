package com.demo.oops;

// overriding interface methods
public class InterfaceAbstractSn {
	public static void main(String[] args) {
		AbstractClass abstractClass = null;
//	Cannot instantiate the type AbstractClass
//	abstractClass = new AbstractClass();
	}
}

interface X {
	public void mx();

	public void my();
}

// class that has abstract method is an abstract class
class XI implements X {

	@Override
	public void mx() {
	}

	@Override
	public void my() {

	}

}

abstract class AbstractClass implements X {

	// can have methods with body
	// can create // AbstractClass abstractClass = null;
	// cannot create // abstractClass = new AbstractClass();
	@Override
	public void mx() {
	}
}