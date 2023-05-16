package Arrays;
import java.util.*;

public class array_traversing {

	public static void main(String[] args) {
		int A[]=new int[7];
		System.out.println("Enter numbers:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<A.length;i++) {
			A[i]=s.nextInt();
		}
		System.out.println("The length is :"+A.length);
		for(int i=0;i<A.length;i++)
			System.out.print(" "+A[i]);
			
		
		
	}

}
