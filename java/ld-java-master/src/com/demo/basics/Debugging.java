package com.demo.basics;

public class Debugging {
public static void main(String[] args) {
	System.err.println("do");
	Test test = new Test();
	test.test1();
	System.err.println("done");
}

}

class Test {
	String ins = "welcome";
	// instance method
	public void test1() {
		String loc1 = "loc1";
		// can call one instance method inside another instance method directly
		test2();
		System.out.println(loc1);
		ins = "hi";
		System.out.println(ins);
	}
	// instance method
	public void test2() {
		String loc2 = "loc2";
		ins  = "hello";
		System.out.println(loc2);
	}
	
}