package basics.ip;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator standardCalculator;
		standardCalculator = new Calculator();
		standardCalculator.add(5, 10);
		// ip perform /, - , * operations
	}
}

class Calculator {
	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
}