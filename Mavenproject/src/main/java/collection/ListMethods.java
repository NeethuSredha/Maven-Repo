package collection;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		List<String> fruit = new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Grape");
		System.out.println(fruit);
		
		//2 get()
		System.out.println(fruit.get(3));
		
		//3 set()
		fruit.set(3, "Lemon");
		System.out.println(fruit);
		
		//4 indexOf()
		System.out.println(fruit.indexOf("Apple"));
		
		//5 lastIndexOf()
		System.out.println(fruit.lastIndexOf("Apple"));
		
		//6 remove()
		fruit.remove(0);
		System.out.println(fruit);
		
		//7 size()
		System.out.println(fruit.size());
		
		//8 isEmpty()
		System.out.println(fruit.isEmpty());
		
		//9 contains()
		System.out.println(fruit.contains("Berry"));
		

	}

}
