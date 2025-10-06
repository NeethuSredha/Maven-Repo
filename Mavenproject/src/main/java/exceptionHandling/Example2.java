package exceptionHandling;

public class Example2 {

	public static void main(String[] args) {
		int age = 10;
		if (age < 18) {
			throw new ArithmeticException("Not eligible");
		} else {
			System.out.println("Eligible");
		}
	}
}
