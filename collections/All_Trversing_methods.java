package collections;

import java.util.ArrayList;
import java.util.*;

public class All_Trversing_methods {
	
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("ankit");
		ar.add("charlie");
		ar.add("Amit");
		ar.add("virat");
		ar.add("shayam");
		ar.add("krishna");
		ar.add("rajesh");
		
		System.out.println("Iterating using List Iterator");
		ListIterator<String> list2=ar.listIterator(ar.size());
		while(list2.hasPrevious()) {
			String str=list2.previous();
			System.out.print(str+" ");
		}
		System.out.println();
		
		System.out.println("\nIterating using Loop");
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i)+" ");
		}
		System.out.println();
		

		System.out.println("\nIterating using ForEach() ");
		ar.forEach(a->{	System.out.print(a+" ");});
		System.out.println();
		
		
		System.out.println("\nIterating using forEachRemaining() method ");
		Iterator<String> list3=ar.iterator();
		list3.forEachRemaining(a->
		{	System.out.print(" "+a);
		});
		
	}
}
