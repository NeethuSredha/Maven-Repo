package abstraction;

import java.util.Scanner;

class FullTimeEmployee extends Employee {
	public double calculateSalary(int hours) {
		double paymentPerDay = paymentPerHour * 8;
		return paymentPerDay * 30;
	}
}

class Contractor extends Employee {
	public double calculateSalary(int hours) {
		double paymentPerDay = paymentPerHour * hours;
		return paymentPerDay * 30;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the working hours of the contractor per day:");
		int hours = sc.nextInt();
		Contractor c = new Contractor();
		double paymentC = c.calculateSalary(hours);
		System.out.println("The payment per hour is Rs.500");
		System.out.println(
				"The Monthly Salary of the Contractor who worked for " + hours + " hours is :" + "Rs." + paymentC);
		FullTimeEmployee f = new FullTimeEmployee();
		double paymentF = f.calculateSalary(8);
		System.out.println("The Monthly Salary of the Full Time Employee is :" + "Rs." + paymentF);
		sc.close();
	}
}