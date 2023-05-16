package collections;

import java.util.Vector;

public class VectorList_methods_1 {
	public static void main(String[] args) {
		Vector<Integer> arr3=new Vector<Integer>();
		arr3.add(4);
		arr3.add(14);
		arr3.add(6);
		arr3.add(13);
		arr3.add(25);
		arr3.add(25);
		arr3.add(40);
		arr3.add(4533);
		System.out.println("Values in vector "+arr3);
		System.out.println("\nVector");
		for(int j: arr3)
			System.out.print(j+" ");
		System.out.println("\nRemoving first occurence of 25\n"+arr3.remove((Integer)25));
		System.out.println("Values in vector "+arr3);
	}
}
