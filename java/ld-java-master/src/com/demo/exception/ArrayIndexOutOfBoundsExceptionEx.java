package com.demo.exception;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		System.err.println("do");
		String subjectString [] = {"oops","exception hanlding", "collections"};
		try {
			for(int i = 0; i<=subjectString.length; i++)
			System.err.println(subjectString[i]);
		} catch (ArrayIndexOutOfBoundsException exception) {
			
			String messageString = exception.getMessage();
			System.err.println("Check the right index " + messageString);
		}
		System.err.println("done");
	}
}

// never do this
//class String {
//	void display() {
//		System.err.println("This is my own String class");
//	}
//}