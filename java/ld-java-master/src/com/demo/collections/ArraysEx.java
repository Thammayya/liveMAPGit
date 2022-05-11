package com.demo.collections;

public class ArraysEx {
	public static void main(String[] args) {
//		primitiveArray();
		booksArray();
	}

	private static void primitiveArray() {
		// declare array
		float monitorSizes[] = null;
		// init array size
		monitorSizes = new float[3];
		// assign elements
		// arrays / indexed / similar data type / fixed in size / continuous memory
		// locations
//         Type mismatch: cannot convert from String to float
//         monitorSizes[2] = "no";
		monitorSizes[2] = 21.5f;
		monitorSizes[1] = 35.5f;
		monitorSizes[0] = 27.5f;

// add one more element
		// declare array
		float monitorSizesNew[] = null;
		// init array size
		monitorSizesNew = new float[monitorSizes.length + 1];
		// transfer elements
		for (int i = 0; i < monitorSizes.length; i++) {
			monitorSizesNew[i] = monitorSizes[i];
		}
		monitorSizesNew[monitorSizesNew.length - 1] = 30.5f;

		for (int i = 0; i < monitorSizesNew.length; i++) {
			System.err.println(monitorSizesNew[i]);
		}
		// IP : remove 2 max monitors and place them in a new array
	}

	private static void booksArray() {
		// declare array
		Book booksArray[] = null;
		// init array size
		booksArray = new Book[2];
		// assign elements
		// arrays / indexed / similar data type / fixed in size / continuous memory
		// locations
		Book book1 = new Book("123-1234567890", "Simon Sinek", 360f);
		booksArray[0] = book1;
		Book book2 = new Book();
//		book2.setISBN("223-1234567890x");
		book2.setISBN("223-1234567890");
		book2.setAuthorName("Amish Tripathi");
		book2.setPrice(360f);
		booksArray[1] = book2;

		for (int i = 0; i < booksArray.length; i++) {
//			System.err.println(booksArray[i]);
			Book book = booksArray[i];
			System.out.println(book.getISBN());
			System.out.println(book.getAuthorName());
			System.out.println(book.getPrice());
		}

	}
}
