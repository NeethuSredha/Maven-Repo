package accessmodifier;

public class Access2 extends Access1{

	public static void main(String[] args) {
		Access1 a1=new Access1();
		a1.display1();
		//a1.display2(); //private is not accessible in different class.
		a1.display3();
		a1.display4();

	}

}
