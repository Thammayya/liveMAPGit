package basics.ip;

public class CalculatorOverloadingEx2 {
	public static void main(String[] args) {
		Calculator standardCalculator;
		standardCalculator = new Calculator();
		// add(int num1, int num2)
		standardCalculator.add(5, 10);
//		add(float num1, int num2
		standardCalculator.add(5.5f, 10);
		// ip perform /, - , * operations
	}
}
