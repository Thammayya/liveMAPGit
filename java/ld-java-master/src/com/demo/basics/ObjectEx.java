package com.demo.basics;

public class ObjectEx {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		// toString() method from object class
		String test1AsString = test1.toString();
		// package name / class name / memeoryaddress
//		com.demo.basics.Test1@7de26db8
		System.err.println(test1AsString);

		Test2 test2 = new Test2();
		// overridden to string method
		String test2AsString = test2.toString();
		System.err.println(test2AsString);
	}
}

class Test1 extends Object {

}

class Test2 extends Object {
	private String testMessage = "Test2 variable";

	@Override
	public String toString() {
		return testMessage;
	}
}