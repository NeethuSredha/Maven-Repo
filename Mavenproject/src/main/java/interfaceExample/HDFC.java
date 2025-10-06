package interfaceExample;

import java.util.*;

public class HDFC implements RBIinterface {
	public double recurringDeposit(double amount, int duration) {
		double interest = amount * (duration*(duration+1))/2*interestRate/(12*100);
		System.out.println("Interest Amount is :"+interest);
		double finalAmount=interest+(amount*duration);
		return finalAmount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HDFC hd = new HDFC();
		System.out.println("Enter the amount :");
		double amount = sc.nextDouble();
		System.out.println("Enter the duration of the deposit in years :");
		int duration = sc.nextInt();
		sc.close();
		double finalAmount = hd.recurringDeposit(amount, duration);
		System.out.print("The final amount after "+duration+" years is :Rs:" );
		System.out.format("%.2f", finalAmount);

	}

}
