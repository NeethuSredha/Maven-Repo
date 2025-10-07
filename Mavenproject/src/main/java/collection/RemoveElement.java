package collection;

import java.util.*;

public class RemoveElement {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(400);
		number.add(500);
		
		System.out.println("The number list before removing third element is :"+number+"\n");
		number.remove(2);
		System.out.println("The number list after removing third element is :"+number);
		
	}

}
