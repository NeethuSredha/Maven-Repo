package encapsulation;

import java.util.Scanner;

public class User extends Bank {
	Scanner sc = new Scanner(System.in);
	int atmPin;

	public void getPin() {
		System.out.println("Please enter the pin :");
		atmPin = sc.nextInt();
	}

	public static void main(String[] args) {
		User c = new User();
		c.getPin();
		c.setPin(c.atmPin);
		c.validatePin();
	}
}
