package exceptionHandling;

public class Example1 {
	
	public static void main(String[] args) {
		try {
		int a=10, b=0;
		int div=a/b;
		System.out.println("Division :"+div);
		}
		/*catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}*/
		finally {
		System.out.println("Necessary code");
		}
	}
}
