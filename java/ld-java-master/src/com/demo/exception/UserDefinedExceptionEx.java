package com.demo.exception;

public class UserDefinedExceptionEx {
public static void main(String[] args) {
//	int age = 19;
	int age = 20;	
	try {
		if(age < 20 || age > 60) {
			//create user def exc
			AgeInvalidException ageInvalidException = new AgeInvalidException("Employee age to be > 19 and < 60");
			// raise exception
			throw ageInvalidException;
		}
		else {
			System.err.println("Ready to work");
		}
	} catch (AgeInvalidException ageInvalidException) {
		String messageString = ageInvalidException.getMessage();
		System.err.println(messageString);
	}
	
}
}


class AgeInvalidException extends Exception{
	public AgeInvalidException(String message) {
		// user defined message to base cons / getMessage()
		super(message);
	}
}