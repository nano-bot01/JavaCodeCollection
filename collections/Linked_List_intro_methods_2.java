package collections;

import java.util.LinkedList;

public class Linked_List_intro_methods_2 {
	private static Object[] as;

	public static void main(String[] args) {
		LinkedList<String> list3=new LinkedList<String>();
			list3.add("Ankit");
			list3.add("Amit");
			list3.add("Bawa");
			list3.add("Sumit");
			list3.add("Karan");
			list3.add("Ajay");
			list3.add("Vijay");
			list3.add("Rajat");
			System.out.println("Initial list3 : "+list3);
			list3.remove(1);
			System.out.println("Removed index one element : "+list3);
			list3.push("abcdefgh");
			System.out.println("Inserted one element : "+list3);
			list3.pop();
			System.out.println("Removed one element : "+list3);
			list3.remove("Ajay");
			list3.push("Ajay");
			System.out.println("After push and remove method : "+list3);
			list3.removeFirst();
			System.out.println("After removeFirst method : "+list3);
			list3.addLast("Ankit");
			System.out.println("After AddLast method : "+list3);
			list3.removeLastOccurrence("Ankit");
			System.out.println("After removeLastOccurence method : "+list3);
			list3.set(0, "Nainwal");			
			as = list3.toArray();
			for(Object i: as) {
				System.out.print(i+"  ");
	}
			System.out.println("\nThe size of LinkedList "+list3.size());
	}
}
