package Arrays;
import java.util.*;
public class array_2d_adding {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int A[][]=new int[3][2];// declaring arrays
		int B[][]=new int[3][2];
		int C[][]=new int[3][2];
		System.out.println("Enter array 1 : ");
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++)
				A[i][j]=s.nextInt();
			System.out.println();
		}
		System.out.println("Enter array 2 : ");
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<B[0].length;j++)
				B[i][j]=s.nextInt();
			System.out.println();
		}
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++)
				C[i][j]+=A[i][j]+B[i][j];
		}
		
		System.out.println("Sum is: ");
		for(int i=0;i<C.length;i++) {
			for(int j=0;j<C[0].length;j++)
				System.out.printf("%2d ",C[i][j]);
			System.out.println();
	 	}
	}
	}
		
		
		