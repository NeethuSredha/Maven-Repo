package collection;

import java.util.*;

public class NonGeneric {

	public static void main(String[] args) {
		
		List colour= new ArrayList();
		colour.add("red");
		colour.add(5);
		colour.add('C');
		colour.add(1.2f);
		System.out.println(colour);
		
		Set fruit=new HashSet();
		fruit.add("red");
		fruit.add(5);
		fruit.add('C');
		fruit.add(1.2f);
		System.out.println(fruit);
	}

}
