package Arrays;
import java.util.*;

public class array_intro {

	public static void main(String[] args) {
		int A[]=new int[10];
		int B[]= {3,4,5,6,7,8,12,14,17,19};
		int C[]= {4,5,6,7,8};
		A[0]=3;
		A[1]=5;
		A[2]=7;
		A[3]=11;
		A[4]=14;
		A[5]=20;
		A[6]=25;
		for(int i=0;i<A.length;i++)
		System.out.print(" "+A[i]);
		System.out.println("\nThe length of A is :"+A.length);
		System.out.println();
		for (int i=0;i<B.length;i++)
			System.out.print(" "+B[i]);
		System.out.println("\nThe length of B is :"+B.length);
		System.out.println("the array is : "+Arrays.toString(A));
		for (int x:C)
		{System.out.print("  "+x);}
	}

}
