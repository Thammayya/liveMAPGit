package com.demo.exception;
// IP handle NullPointerException too.
// IP try inside catch & finally
public class NestedTryEx3 {
	public static void main(String[] args) {
		System.err.println("do");
		int result = 0, num1, num2;
		num1 = 1000;
		num2 = 200;
//		num2 = 0;
		String subjectString [] = {"oops","exception hanlding", "collections"};
		try {
			result = num1 / num2;
			System.err.println("1");
			try {
				for(int i = 0; i<=subjectString.length; i++)
					System.err.println(subjectString[i]);
			} catch (ArrayIndexOutOfBoundsException exception) {
				String messageString = exception.getMessage();
				System.err.println("Check index : " + messageString);
			}
			System.err.println("2");
		} catch (ArithmeticException exception) {
			String messageString = exception.getMessage();
			System.err.println("No / 0 " + messageString);
		}
		
		System.err.println(result);
		System.err.println("done");		
	}
}
