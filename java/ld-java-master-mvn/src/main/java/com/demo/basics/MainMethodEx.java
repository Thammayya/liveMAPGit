package com.demo.basics;
//IP accept rainbow colors
public class MainMethodEx {
	// get the apples before starting the program
	public static void main(String[] applesArray) {
//		stringArray();
		System.out.println(applesArray[2]);
		System.err.println(applesArray[1]);
		System.err.println(applesArray[0]);
	}
//	[static ft]
	public static void stringArray() {
		// String / system (pre) defined class
		// declare
		String applesArray[];
		// initalized
		applesArray = new String[3];
		applesArray[0] = "Red";
		applesArray[1] = "Green";
		applesArray[2] = "Yellow";

		System.out.println(applesArray[2]);
		System.err.println(applesArray[1]);
		System.err.println(applesArray[0]);
	}
}




//$ java MainMethodEx
//Error: Main method not found in class MainMethodEx, please define the main method as:
//   public static void main(String[] args)
//public class MainMethodEx {
//	public static void main(int[] applesArray) {
//
//	}
//}
