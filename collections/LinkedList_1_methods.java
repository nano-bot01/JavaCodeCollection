package collections;

import java.util.LinkedList;

public class LinkedList_1_methods {

	public static void main(String[] args) {
		
	LinkedList<Integer> list1=new LinkedList<Integer>();
	list1.add(4);
	list1.add(14);
	list1.add(6);
	list1.add(13);
	list1.add(25);
	list1.add(25);
	list1.add(40);
	System.out.println("LinkedList");
	for(int j: list1)
		System.out.print(j+" ");
	list1.addFirst(2);
	list1.addFirst(3);
	list1.addLast(30);
	list1.addLast(31);
	System.out.println("\nAfter addFirst and AddLast in LinkedList");
	for(int j: list1)
		System.out.print(j+" ");
	System.out.println("\nAfter removeing items");
	list1.remove(); //removes the head of LinkedList;
	list1.remove();
	list1.remove();
	for(int j: list1)
		System.out.print(j+" ");
	
	System.out.println("\nAfter RemoveLast in LinkedList");
	list1.removeLast();
	list1.removeLast();
	for(int j: list1)
		System.out.print(j+" ");
}
}
