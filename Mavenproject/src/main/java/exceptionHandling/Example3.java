package exceptionHandling;

public class Example3 {

	public static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Not1 eligible");
		} else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(16);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid Age");
		}
	}
}
