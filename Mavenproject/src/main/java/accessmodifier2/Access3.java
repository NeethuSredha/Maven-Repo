package accessmodifier2;

import accessmodifier.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		Access1 a1=new Access1();
		a1.display1();
		//a1.display2();
		//a1.display3();
		//a1.display4();
		
		Access3 a3=new Access3();
		a3.display1(); //public
		//a3.display2(); //private
		a3.display3(); //protected
		//a3.display4(); //default

	}

}
