package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> ts=new TreeMap<Integer,String>();
		ts.put(106,"bc");
		ts.put(107,"acc");
		ts.put(101,"acc");
		ts.put(103,"ac");
		ts.put(105,"cc");
		ts.put(105,"cc");// No dublicate
		ts.put(104,"bcc");
		ts.put(100,"abcc");
		ts.put(102,"abc");
		
		for(Map.Entry m:ts.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		System.out.println("\nremoved two elements\n");
		ts.remove(107);
		ts.remove(106,"bc");
		for(Map.Entry m:ts.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		System.out.println("headMap: "+ts.headMap(102,true));  
		System.out.println("tailMap: "+ts.tailMap(102,true));
		System.out.println("subMap: "+ts.subMap(100, false, 102, true));  
		
		
		
		
		
}}