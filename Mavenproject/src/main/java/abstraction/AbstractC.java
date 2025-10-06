package abstraction;

public class AbstractC extends AbstractP{
	public void start() {
	System.out.println("Car starts");
}
	public void breakCar(int a) {
		System.out.println("Break");
		
	}
	public static void main(String[] args) {
		
		AbstractC c = new AbstractC(); 
		//AbstractP c = new AbstractC();
		c.start();
		c.breakCar(5);
		c.stop();
	}

}
