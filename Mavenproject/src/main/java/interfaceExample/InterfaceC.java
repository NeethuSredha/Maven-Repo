package interfaceExample;

public class InterfaceC implements InterfaceP{
	public void print() {
		System.out.println("Printing");
	}
	public static void main(String[] args) {
		InterfaceC c = new InterfaceC();
		c.print();

	}

}
