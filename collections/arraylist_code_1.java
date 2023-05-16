package collections;
import java.util.ArrayList;
import java.util.TreeSet;


public class arraylist_code_1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr3=new ArrayList<Integer>();
		arr3.add(4);
		arr3.add(14);
		arr3.add(6);
		arr3.add(13);
		arr3.add(25);
		arr3.add(25);
		arr3.add(40);
		System.out.println("ArrayList\n");
		for(int j: arr3)
			System.out.print(j+" ");
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(30);
		t.add(20);
		t.add(245);
		t.add(75);
		t.add(4);
		t.add(15);
		System.out.println("\nTreeSet");
			for(int j: t)
				System.out.print(j+" ");
		System.out.println("TreeSet is changed to ArrayList");
		ArrayList<Integer> arr2=new ArrayList<Integer>(t);
			for(int i: arr2)
				System.out.println(i);
			
			
		System.out.println("ArrayList is changed to TreeSet");	
		TreeSet<Integer> t2=new TreeSet<Integer>(arr3);
		for(int j: t2)
			System.out.println(j);
		
		
		
		
		
		
		
		
		
		
		
	}
}
