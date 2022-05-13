package com.demo.basics;

public class ObjectEx {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		String test1AsString = test1.toString();
		// package name / class name / memeoryaddress
//		com.demo.basics.Test1@7de26db8
		System.err.println(test1AsString);
	}
}

class Test1 extends Object {

}