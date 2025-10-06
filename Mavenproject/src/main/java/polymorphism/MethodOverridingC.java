package polymorphism;

public class MethodOverridingC extends MethodOverridingP {
	public int add(int num1, int num2) {
		super.add(10, 4);
		int sub = num1 - num2;
		System.out.println("Sub is :" + sub);
		return sub;
	}

	public static void main(String[] args) {
		MethodOverridingC c = new MethodOverridingC();
		c.add(20, 30);

	}

}
