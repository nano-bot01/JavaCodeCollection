package string;
import java.util.*;
public class string_index_of_strng {

	
	public static void main(String[] args) {
		String s="Ankit NAinwal is an Proactive Person";
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the index  ");
		int n=sc.nextInt();
		System.out.println(s);
		int index=s.charAt(n);
		System.out.println("Element at given index is : "+(char)index);
		
	}

}
