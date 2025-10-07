package collection;

import java.util.*;

public class RetrieveCollection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> fruit = new ArrayList<String>();
		fruit.add("Mango");
		fruit.add("Grape");
		fruit.add("Pomegranate");
		fruit.add("Kiwi");
		fruit.add("Orange");

		System.out.println("Enter the index of the element to retrieve : ");
		int index = sc.nextInt();

		try {
			System.out.println("The element at index " + index + " is : " + fruit.get(index));
		} catch (IndexOutOfBoundsException i) {
			System.out.println("Invalid index.");
		}

	}

}
