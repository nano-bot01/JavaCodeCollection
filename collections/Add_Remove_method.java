package collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Add_Remove_method {

		public static void main(String[] args) {
		ArrayList<Integer> ar4=new ArrayList<Integer>();
			ar4.add(4);
			ar4.add(14);
			ar4.add(6);
			ar4.add(13);
			ar4.add(25);
			ar4.add(40);
			System.out.println("ArrayList");
			for(int j: ar4)
				System.out.print(j+" ");
			
			System.out.println("\nremoved elements");
			ar4.remove(1);
			ar4.remove(4);
			ar4.remove(3);
			ar4.remove(0);
			for(int j: ar4)
				System.out.print(j+" ");
			
		TreeSet<Integer> tree1=new TreeSet<Integer>();
			tree1.add(30);
			tree1.add(20);
			tree1.add(245);
			tree1.add(75);
			tree1.add(4);
			tree1.add(15);
			System.out.println("\n\nTreeSet");
				for(int j: tree1)
					System.out.print(j+" ");
				
			System.out.println("\nAfter removing elements");
				tree1.remove(30);
				tree1.remove(4);
				tree1.remove(75);
				tree1.remove(15);
				for(int i: tree1)
					System.out.print(i+" ");
				
			System.out.println("\n\nSize of tree "+tree1.size());
			if(tree1.contains(20))
				System.out.println("Element Found ");
			else 
				System.out.println("Element is not present in TreeSet");
	}
}
