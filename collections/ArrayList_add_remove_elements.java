package collections;

import java.util.*;

public class ArrayList_add_remove_elements {
	
	public static void main(String[] args) {
			
		ArrayList<String> arr10 =new ArrayList<String>();
		ArrayList<Integer> arr12 =new ArrayList<Integer>();
		arr12.clear();
			arr10.add("Ankit");
			arr10.add("Amit");
			arr10.add("NITIN");
			arr10.add("Shyam");
			arr10.add("Ritik");
			arr10.add("Ram");
			arr10.add("Bhavishya");
		ArrayList<String> arr11 =new ArrayList<String>();
			arr11.addAll(arr10);
			System.out.println("After adding all the elements : "+arr11);
			arr11.remove(0);
			arr11.remove(0);
			System.out.println("After removing 2 elements : "+arr11);
			arr11.clear();
			System.out.println("After clear() function : "+arr11);
			arr11.addAll(arr10);
			System.out.println("After adding all the elements again : "+arr11);
			arr11.removeIf(str->str.contains("Amit")); // using lamada expression
			System.out.println("After using removeIf method : "+arr11);
			arr10.retainAll(arr11);
			System.out.println("After using retainAll method : "+arr10);
	}
}
