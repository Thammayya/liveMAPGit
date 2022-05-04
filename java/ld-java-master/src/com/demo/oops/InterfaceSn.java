package com.demo.oops;
// overriding interface methods
public class InterfaceSn {

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

abstract class XI1 implements X {

	@Override
	public void mx() {
	}
}