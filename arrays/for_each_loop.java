package Arrays;
import java.util.*;
public class for_each_loop {

	public static void main(String[] args) {
		int a[]= new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array");
		for(int b=0;b<a.length;b++)
			a[b]=s.nextInt();
		for( int c:a)
		{ System.out.print(c+" ");
		
	}
}}
