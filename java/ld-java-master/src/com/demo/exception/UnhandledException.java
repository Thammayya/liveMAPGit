package com.demo.exception;

public class UnhandledException {
	public static void main(String[] args) {
		System.err.println("do");
		int result, num1, num2;
		num1 = 1000;
//		num2 = 200;
		num2 = 0;
		result = num1 / num2;
		System.err.println(result);
		System.err.println("done");
	}
}
