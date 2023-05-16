package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class Using_Iterator_1 {
	public static void main(String[] args) {
		
	
	ArrayList<String> arr6=new ArrayList<String>();
		arr6.add("Ankit");
		arr6.add("Ankii");
		arr6.add("Anku_");
		arr6.add("ram");
		arr6.add("Conner");
		arr6.add("charlie");
		
		Iterator<String> itt3=arr6.iterator();
		while(itt3.hasNext()){
			System.out.print(" "+itt3.next());
		}
		ArrayList<Integer> arr7=new ArrayList<Integer>();
		arr7.add(3543);
		arr7.add(334);
		arr7.add(234);
		arr7.add(88);
		arr7.add(987);
		arr7.add(3);
		
		System.out.println();
		Iterator<Integer> itt1=arr7.iterator();
		while(itt1.hasNext()){
			System.out.print(" "+itt1.next());
		}
}
}