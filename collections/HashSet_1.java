package collections;

import java.util.HashSet;

public class HashSet_1 {
public static void main(String[] args) {
	HashSet<String> set=new HashSet();
	HashSet<String> set1=new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		set.add("Seven");
		set.add("Seven");// duplicate values are not allowed
		set.add("Eight");	
		set.add("Eight");	
		set.add("Nine");
		set.add("Ten");
		set.add("Nine");
		set.forEach(a->{
			System.out.println(" "+a);
		});
		System.out.println("Some methods: ");
		set1.addAll(set);
		set.remove("One");
		System.out.println(" removed first element: "+set);
		System.out.println(set.remove("Ten"));
		System.out.println(" removed Ten element: "+set);
		set.removeIf(str->str.contains("Four"));
		System.out.println(" removed Four element: "+set);
		
		
}
}
