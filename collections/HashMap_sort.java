package collections;

import java.util.HashMap;
import java.util.*;

public class HashMap_sort {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(106,"bc");
		hmap.put(107,"acc");
		hmap.put(101,"acc");
		hmap.put(103,"ac");
		hmap.put(105,"cc");
		hmap.put(105,"cc");// No dublicate
		hmap.put(104,"bcc");
		hmap.put(100,"abcc");
		hmap.put(102,"abc");
		
		for(Map.Entry m:hmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		TreeMap<String, Integer> sorted = new TreeMap<>();
		 System.out.println(sorted);
	
	}
}
kjfak€askdljfkl