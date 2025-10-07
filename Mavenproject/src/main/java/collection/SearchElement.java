package collection;

import java.util.*;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> number = new ArrayList<Integer>();
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(400);
		number.add(500);
		
		System.out.println("Enter the element to search : ");
		int num = sc.nextInt();
		
		if (number.contains(num)) {
			System.out.println("The number " + num + " is present at index " + number.indexOf(num) + ".");
		} else
			System.out.println("The number " + num + " is not present.");

	}

}
