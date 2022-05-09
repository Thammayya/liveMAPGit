package com.demo.exception;

public class ThrowsException2 {
	public static void main(String[] args) {
		System.err.println("do");
		//main caller / divide called
//		divideExceptionHandled();
		try {
			divideExceptionUnHandled();
		} catch (ArithmeticException exception) {
			String messageString = exception.getMessage();
			System.err.println("No dividing by 0 " + messageString);
		}
		System.err.println("done");
	}

	
	private static void divideExceptionHandled() {
		int result = 0, num1, num2;
		num1 = 1000;
//		num2 = 200;
		num2 = 0;
		try {
			result = num1 / num2;
			System.err.println("not here!");
		} catch (ArithmeticException exception) {
			String messageString = exception.getMessage();
			System.err.println("No dividing by 0 " + messageString);
		}
		System.err.println(result);
	}
	// may throw ArithmeticException / caller to handle
	private static void divideExceptionUnHandled() throws ArithmeticException{
		int result = 0, num1, num2;
		num1 = 1000;
//		num2 = 200;
		num2 = 0;
			result = num1 / num2;
			System.err.println("not here!");
		System.err.println(result);
	}
}
