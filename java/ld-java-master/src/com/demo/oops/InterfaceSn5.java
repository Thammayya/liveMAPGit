package com.demo.oops;

// extends and implements
public class InterfaceSn5 {
	public static void main(String[] args) {
		System.err.println(X5.testString);
		System.err.println(X5.testString1);
// The final field X5.testString cannot be assigned
//X5.testString = "no way";
		TestX5 testX5 = new TestX5();
		testX5.mx();
	}
}

interface X5 {
//	The blank final field testString may not have been initialized
//	String testString;
	String testString = "final variable than cannot be modified";
	final String testString1 = "final variable than cannot be modified 1";

	public void mx();
}

class TestX5 implements X5 {
	@Override
	public void mx() {
//		The final field X5.testString cannot be assigned
//		testString = "no way";	
		System.err.println("mx() method : " + testString);
	}

}