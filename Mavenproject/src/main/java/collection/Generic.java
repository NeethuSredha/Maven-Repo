package collection;

import java.util.*;

public class Generic {

	public static void main(String[] args) {
		List<Integer> data=new LinkedList<Integer>(); 
		data.add(4);
		data.add(10);
		data.add(2);
		data.add(5);
		System.out.println(data);
		
		Set<Integer> data1=new HashSet<Integer>();
		data1.add(4);
		data1.add(10);
		data1.add(2);
		data1.add(5);
		System.out.println(data1);
		
		
		

	}

}
