package Arrays;
import java.util.*;
public class array_2d_intro {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int A[][]=new int[3][2];// declaring arrays
		int B[][]= {{1,2,3},{2,3,4},{5,6,7}};//initalising array
		int C[][]= new int [3][];
		C [0]=new int [2];
		C[1]= new int [4];
		C[2] =new int [3];
		System.out.println("Enter array 1 : ");
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++)
				A[i][j]=s.nextInt();
			System.out.println();
		}
		System.out.println("Enter array C:");
		for(int i=0;i<C.length;i++) {
			for(int j=0;j<C[2].length;j++)//jagged array is showing problem of index
				C[i][j]=s.nextInt();
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++)
				System.out.print(" "+A[i][j]);
			System.out.println();
		}
		System.out.println();
		System.out.println("\n\n\t");
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<B[0].length;j++)
				System.out.print(" "+B[i][j]);
			System.out.println();
		}
		
		for (int x[]:C) {
			for (int y:x) {
				System.out.print(" "+y);
			}
			System.out.println();
		}
			}
	}


