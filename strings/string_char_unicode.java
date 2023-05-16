package string;
import java.util.*;
public class string_char_unicode {

	
	public static void main(String[] args) {
		char s;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the character: ");
		s=sc.next().charAt(0);
		int index=s;

		System.out.println("Element is : "+(int)index);
		System.out.println("Element at given index is : "+index);
		
	}

}
