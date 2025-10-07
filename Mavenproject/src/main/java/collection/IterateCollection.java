package collection;

import java.util.*;

public class IterateCollection {
	public static void main(String[] args) {
		List<String> mobile = new ArrayList<String>();
		mobile.add("OnePlus");
		mobile.add("Apple");
		mobile.add("Sony");
		mobile.add("Samsung");
		mobile.add("Oppo");

		System.out.println("Iterating through the array list. The elements are :\n");
		for (String m : mobile) {
			System.out.println(m);
		}
	}

}
