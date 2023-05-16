package collections;

import java.util.*;

public class Java_List_Interface_1{

	public static void main(String[] args) {
		
		List<String> list5 =new ArrayList<String>();
			list5.add("Ankit");
			list5.add("Nainwal");
			list5.add("Aryan");
			list5.add("Ambar");
			list5.add(0,"Ayush");
			list5.add("Nitin");
			list5.add("Ajay");
			list5.add("Ankit");
			list5.add(2,"Charlie Puth");
			list5.add("Christen Bale");
			list5.add("Berlin");
			System.out.println(" The list is here: "+ list5+"\n");
			Set<String> st1= new TreeSet<String>();
			st1.addAll(list5);
			
			System.out.println("Here comes SET ST1: "+st1);
			Collections.sort(list5, Collections.reverseOrder());
			List<String> list6=new ArrayList<String>(st1);
			list6.sort(Collections.reverseOrder());
			System.out.println("After descending Sort using list "+ list6+"\n");
			Collections.sort(list6 );
			System.out.println("After again Sort using list "+ list6+"\n");
			
			list6.clear();
			System.out.println("List6 is ~Cleared  "+ list6);
			
			list6.addAll(list5);
			System.out.println(list5.equals(list6)? "objects are equal": "objects are unequal"+"\n");
			System.out.println("the hashCode of list6 is "+list6.hashCode() +"\n");
			System.out.println("the hashCode of SET st1 is "+st1.hashCode() +"\n");
			
			st1.clear();
			System.out.println("isempty() on st1 gives: "+st1.isEmpty()+"\n");
			System.out.println("in list 6 last index of Ankit is: "+list5.lastIndexOf("Ankit")+"\n");
//			list6.addAll(list5);
//			System.out.println("Here comes List6: "+list6);
//			boolean eq=list5.equals(list6)? true: false;
//			if(eq)
//				System.out.println("list5 is equal to list6");
			
			
			
			
			
			
			
	}
}
