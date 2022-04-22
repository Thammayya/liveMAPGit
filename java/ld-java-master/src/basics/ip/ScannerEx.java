package basics.ip;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Calculator standardCalculator;
		standardCalculator = new Calculator();
		// read keyboard
		Scanner scanner = new Scanner(System.in);
		System.err.println("1 : ");
		String num1String = scanner.nextLine();
		System.err.println("2 : ");
		String num2String = scanner.nextLine();
		//convert string to int
		int num1 =  Integer.parseInt(num1String);
		int num2 =  Integer.parseInt(num2String);
		standardCalculator.add(num1, num2);
		// ip perform /, - , * operations
	}
}

