package collections;

import java.util.ArrayList;

public class Isempty_method_ArrayList {
	
	private static ArrayList<String> arr13, arr12;

	public static void main(String[] args) {
		arr12=new ArrayList<String>();
		arr12.add("ankit");
		arr12.add("vinay");
		arr12.add("babay");
		arr12.add("dillion");
		arr12.add("sunflower");
		arr12.add("post malone");
		arr12.add("marvel");
		
		arr13 = new ArrayList<String>(arr12);
		arr13.add("ankit");
		arr13.add("vinay");
		arr13.add("babay");
		arr13.add("dillion");
		arr13.add("sunflower");
		
		System.out.println("Is ArrayList arr13 Empty: "+arr12.isEmpty());   
		System.out.println(" the elements are here \n"+ arr12);
		
		arr12.removeAll(arr12);
		System.out.println("Is ArrayList arr12 Empty: "+arr12.isEmpty());   
		System.out.println(" the elements after removing are here \n"+ arr12);
		
		arr12.addAll(arr13);
		System.out.println(" the elements after again adding all are here \n"+ arr12);
		
		arr12.retainAll(arr13);
		System.out.println(" the elements after retain all are here \n"+ arr13);

	}
}
