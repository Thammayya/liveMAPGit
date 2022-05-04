package com.demo.oops;

// extends and implements
public class InterfaceSn5 {
	public static void main(String[] args) {
		System.err.println(X5.testString);
		System.err.println(X5.testString1);
// The final field X5.testString cannot be assigned
//X5.testString = "no way";
	}
}

interface X5 {
//	The blank final field testString may not have been initialized
//	String testString;
	String testString = "welcome";
	final String testString1 = "welcome1";

	public void mx();
}
