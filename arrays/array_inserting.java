package Arrays;

public class array_inserting {

	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=10;
		int A[]=new int[n];
		A[0]=3;
		A[1]=5;
		A[2]=6;
		A[3]=8;
		A[4]=9;
		System.out.print("Enter the index to insert: ");
		int index=s.nextInt();
		System.out.print("Enter the index to insert: ");
		int p=s.nextInt();
		for(int i=10;i>index;i--) {
			A[i]=A[i-1];
			A[index]=p;
		}
		for(int i=0;i<A.length;i++) 
			System.out.print(" "+A[i]);	
	}}