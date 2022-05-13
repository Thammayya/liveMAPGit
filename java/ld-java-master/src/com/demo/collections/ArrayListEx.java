package com.demo.collections;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		addDisplay();
	}

	private static void addDisplay() {
		// declare collection
		// indexed / different data types / objects / dynamic
		ArrayList arrayList = null;
		// initialize the ArrayList
		arrayList = new ArrayList();
		// Float - wrapper class / float
		Float float1 = 21.5f;
		Object floatObject = float1;
		arrayList.add(floatObject);
		arrayList.add(35.5f);
		arrayList.add(27.5f);

		System.err.println(arrayList);

//		for(int i = 0; i<monitorSizes.size(); i++) {
//		Object floatObject2 =	monitorSizes.get(i);
//		Float float2 = (Float) floatObject2;
//		System.err.println(floatObject2);
//		System.err.println(float2);
//		}
		
		System.err.println("Floats");
		for(int i = 0; i<arrayList.size(); i++) {
		System.err.println(arrayList.get(i));
		}
		
		arrayList.add(5);
		arrayList.add(true);
		Book book1 = new Book("123-1234567890", "Simon Sinek", 360f);
		arrayList.add(book1);
		System.err.println("Different Objects");
		
		for(int i = 0; i<arrayList.size(); i++) {
		System.err.println(arrayList.get(i));
		}
		
		//  super cool lambdas
		System.err.println("cool enhanced for loop");
		for(Object object : arrayList) {
			System.err.println(object);
		}
		
		// super cool lambdas [COVERED LATER]
		System.err.println("super cool lambdas");
		arrayList.forEach(System.out::println);
	}

}
