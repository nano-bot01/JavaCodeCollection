package collections;

import java.util.LinkedList;

public class Linked_List_intro_methods {
	public static void main(String[] args) {
		
	LinkedList<String> list2=new LinkedList<String>();
		list2.add("Ankit");
		list2.add("Amit");
		list2.add( "Rakesh");
		list2.add("Badshah");
		list2.add("Rama");
		list2.addFirst("atif");// at first
		list2.addFirst("sumit");
		list2.addLast("nitin");// at last
		list2.add(2,"Nainwal");// insert at a particular index
		
		System.out.println("the initial list is :");
//		Iterator <String> itt=list2.iterator();
//		while(itt.hasNext()) {
//			System.out.println(itt.next());
//		} 
		System.out.println(list2);
	LinkedList<String> list3=new LinkedList<String>();	
		list3.addAll(list2);
		System.out.println(" the list3 is here: \n"+list3);
		list3.clear();
		System.out.println(" after clearing list3 \n"+list3);
		System.out.println("Is there is \"Ankit\" in list2 ? "+list2.contains("Ankit"));
		System.out.println("Index of \"Ankit\" is "+list2.indexOf("Ankit"));
		System.out.println("Element at index 5 is "+list2.get(5));		
		System.out.println("First element is "+list2.getFirst());
		System.out.println("Last element is "+list2.getLast());
		list2.offer("abcdef");
		list2.offerLast("Bawa ji bye bye");
		list2.offerFirst("bawa ji hello");
		System.out.println("List after offer method "+list2);
		System.out.println(" the peek Method	: "+list2.peek());
		System.out.println(" the peekFirst Method	: "+list2.peekFirst());
		System.out.println(" the peekLast Method	: "+list2.peekLast());
		System.out.println(" List before 3 poll methods: "+list2);
		list2.poll();
		list2.pollFirst();
		list2.pollLast();
		System.out.println(" List after 3 poll methods: "+list2);
		list2.remove();// removes first element 
		list2.remove(2);// element at index 2 is removed
		list2.push("hacked");// insert at head
		System.out.println("List after 2 remove and a push methods "+list2);
		list2.remove("hacked");
		System.out.println("List after 2 remove object method "+list2);
	}	
}