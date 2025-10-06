package encapsulation;

public class Bank {

	private int pin;// valid = 0;

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void validatePin() {
		if(pin==1001 || pin==1234 || pin==1212) {
			System.out.println("The entered pin is valid.");
		}
		else
			System.out.println("The entered pin is not valid.");
	}
	
	
	/*{
		int[] validPin = { 1001, 1234, 1212 };
		for (int i = 0; i < validPin.length; i++) {
			if (pin == validPin[i]) {
				valid = 1;
				System.out.println("The entered pin is valid. You can withdraw the required amount.");
				break;
			}
		}
		if (valid == 0)
			System.out.println("The entered pin is not valid.");
	}*/
}


