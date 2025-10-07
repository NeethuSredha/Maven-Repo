package collection;

import java.util.*;

public class SetMethods {

	public static void main(String[] args) {
		Set<String> fruit=new HashSet<String>();
		fruit.add("Lemon");
		fruit.add("Apple");
		fruit.add("Grape");
		fruit.add("Kiwi");
		System.out.println(fruit);
		
		Set<String> color =new HashSet<String>();
		color.add("Yellow");
		color.add("Red");
		color.add("Purple");
		color.add("Green");
		System.out.println(color);
		
		fruit.addAll(color);
		System.out.println(fruit);
		
		System.out.println(fruit.contains("Yellow"));
		System.out.println(fruit.containsAll(color));
		
		fruit.remove("Yellow");
		System.out.println(fruit.contains("Yellow"));
		System.out.println(fruit.containsAll(color));
		

	}

}
