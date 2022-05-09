:beginner: _**Implement Exception Handling**_  


:dart: **Understand what exceptions are and when and how they happen. Learn how to handle exceptions gracefully. Learn to implement exception handling in Java using the try and catch statements and use “checked” and “unchecked” categories of exceptions to handle errors of exception.**  

- exceptions
  - abnormal conditions that occur during the execution of a program
  - ex : file not found, out of memory, divide by zero
  - unhandled exceptions abruptly terminate the program
  - ideally should be handled for graceful termination

:computer: **Unhandled Exception**  
```java
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

```
:key: **exception handling**

- exceptions are hanlded by using 
  - try catch finally block
  - try / suspicious part of code
  - catch / exception handling logic
  - finally / clean up operations