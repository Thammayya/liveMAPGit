package com.demo.collections;

public class ArraysEx {
	public static void main(String[] args) {
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
}
