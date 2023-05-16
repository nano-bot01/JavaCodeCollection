package collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.TreeSet;



public class hashset_exp_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> s1=new ArrayList<Integer>();
		s1.add(6);
		s1.add(4);
		System.out.println(s1.add(14));
		System.out.println(s1.add(10));
		
		for(Object i: s1) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		HashSet<Integer> s2=new HashSet<Integer>();
		s2.add(6);
		s2.add(4);
		s2.add(14);
		s2.add(40);
		s2.add(23);
		System.out.println(s2.add(5));
		System.out.println(s2.add(43));
		System.out.println(s2.add(43));
		System.out.println(s2.add(17));
		System.out.println(s2.add(17));
		System.out.println(s2.add(23));
				
		for(Object i: s2)
			System.out.print(i+" ");
		System.out.println("\n");
		
		TreeSet<Integer> s3=new TreeSet<Integer>();
		s3.add(4);
		s3.add(6);
		s3.add(40);
		s3.add(14);
		
		System.out.println("Equals method: "+s1.equals(s3));
		System.out.println(s3.contains(14));//An element is present or not
		System.out.println(s3.add(5));
		System.out.println(s3.add(55));
		System.out.println(s3.add(24));
		System.out.println(s3.add(47));
		s3.remove(5);	//remove element
		for(int i: s3)
			System.out.print(i+" ");
		
 	}
}
