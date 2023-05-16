package collections;

import java.util.*;

public class HashMap_1 {
public static void main(String[] args) {
	HashMap <Integer, String> hmap=new HashMap<Integer, String>();
	//hmap.put(0, "null");
	hmap.put(-9, "okk");
	hmap.put(1, "Ankit");
	hmap.put(6, "Ram");
	hmap.put(4, "Girish");
	hmap.put(5, "Shyaam");
	hmap.put(5, "Shyaam"); // no duplicate 
	hmap.put(2, "Abhinav");
	hmap.put(3, "Singh");
	hmap.put(7, "Girish");

	System.out.println("Iteration\n");
	for(Map.Entry m:hmap.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	TreeMap<Integer, String> tmap=new TreeMap<Integer,String>(hmap);
	System.out.println("\nInteration of treemap\n");
	for(Map.Entry m:tmap.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	System.out.println("\nIteration\n");
	hmap.putIfAbsent(0, "null");
	for(Map.Entry m:hmap.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	hmap.remove(0);
	hmap.remove(1,"Ankit");// using both key and value
	hmap.remove(2);
	System.out.println("\nRemoved 3 element\n");
	for(Map.Entry m:hmap.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	hmap.replace(6, "Ram", "Nainwal");
	System.out.println("\nReplace Ram by Nainwal\n");
	for(Map.Entry m:hmap.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	hmap.replaceAll((k,v)->"Ankit");
	System.out.println("\nReplace all \n");
	for(Map.Entry m:hmap.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	
	
}
}
