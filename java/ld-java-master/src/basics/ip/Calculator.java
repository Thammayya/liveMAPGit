package basics.ip;
class Calculator {
	// overloaded functions
	// same name / diff type of args
	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	public void add(float num1, int num2) {
		float sum = num1 + num2;
		System.out.println(sum);
	}
}