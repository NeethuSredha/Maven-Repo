package finalKeyword;

public class FinalVariable {

	public static void main(String[] args) {
		final int num=10;
		//num=20; //the final local variable cannot be assigned.
		System.out.println("Number is :"+num);
	}

}
