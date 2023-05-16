package collections;

import java.util.*;

public class TreeSet_1 {

	public static void main(String[] args) {
		TreeSet <Integer> ts=new TreeSet<Integer>();
		ts.add(433);
		ts.add(3);
		ts.add(2);
		ts.add(12);
		ts.add(27);
		ts.add(39);
		ts.add(39);// no doublicate allowed
		ts.add(41);
		ts.add(57);
		ts.add(63);
		ts.add(76);

		
		for (int x:ts){
			System.out.println(x);
		}
		
		//System.out.println(ts);
		
//		Iterator i=ts.descendingIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		System.out.println("Lowest Value: "+ts.pollFirst());    
        System.out.println("Highest Value: "+ts.pollLast());    
	
        System.out.println("Initial Set: "+ts);  
        System.out.println("Reverse Set: "+ts.descendingSet());   
        // shows in decending order 
        System.out.println("Head Set: "+ts.headSet(65, true));
        // Gives elements from value to end 
        System.out.println("SubSet: "+ts.subSet(2, true, 57, true));
        // Gives  subset between  eand 57 including 57 
        System.out.println("TailSet: "+ts.tailSet(3, false));  
        // Gives elements tail value to end 
        ts.remove(2);
        ts.remove(3);
        ts.remove(76);
        Iterator ii=ts.descendingIterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
        
		TreeSet <String> ts1=new TreeSet<String>();
			ts1.add("One");
			ts1.add("Two");
			ts1.add("Three");
			ts1.add("Four");
			ts1.add("Five");
			ts1.add("Six");
			ts1.add("Seven");
			ts1.add("Seven");// duplicate values are not allowed
			ts1.add("Eight");	
			ts1.add("Eight");	
			ts1.add("Nine");
			ts1.add("Ten");
			ts1.add("Nine");
			System.out.println("\"Sorted\"");
			ts1.forEach(a->{
			System.out.println(" "+a);
		});

	}
	
	
}
