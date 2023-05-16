package collections;

import java.util.ArrayList;

public class Get_Set_methods_1 {

	public static void main(String[] args) {
		  ArrayList<String> arr8=new ArrayList<String>();  
		  arr8.add("Mango");  
		  arr8.add("Apple");  
		  arr8.add("Banana");  
		  arr8.add("Grapes");  
		  arr8.add("Tomato");  
		  arr8.add("Watermelon");
		  arr8.add("Lemon");  
	
		  System.out.println("Traversng:");
		  arr8.forEach(a->{
			  	System.out.print(" "+a+",");
		  });
		  
		  System.out.println("element at Second index is "+arr8.get(1));
		  arr8.set(1, "Pomgranate");
		  System.out.println("element at Second index is "+arr8.get(1));
		  
	}
}
