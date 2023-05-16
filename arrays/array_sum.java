package Arrays;

import java.util.Scanner;

public class array_sum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements ");
		int n=s.nextInt();
		
		int A[]=new int[n];
		int sum=0;
		System.out.print("Enter numbers: ");
		for(int i=0;i<A.length;i++) {
			A[i]=s.nextInt();
		}
		for(int i=0;i<A.length;i++)
			sum+=A[i];
		System.out.println("The sum of elements is : "+sum);
		

	}

}
