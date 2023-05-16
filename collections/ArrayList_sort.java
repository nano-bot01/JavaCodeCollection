package collections;

import java.util.*;

public class ArrayList_sort {

	public static void main(String[] arr6gs) {
		ArrayList<String> arr6=new ArrayList<String>();
		arr6.add("ankit");
		arr6.add("charlie");
		arr6.add("Amit");
		arr6.add("virat");
		arr6.add("vijay");
		arr6.add("zendaya");
		arr6.add("gopal");
		arr6.add("donalds");
		arr6.add("mohan");
		arr6.add("shayam");
		arr6.add("krishna");
		arr6.add("rajesh");
		
		Collections.sort(arr6);
		for(String abc:arr6)
			System.out.println(abc+ " ");
		Collections.sort(arr6, Collections.reverseOrder());
		System.out.print(arr6+" ");
	}
}
