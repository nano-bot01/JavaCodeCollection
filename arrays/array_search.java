package Arrays;

//import Scanner;

public class array_search {

	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("Enter the number of elements ");
		int n=s.nextInt();
		
		int A[]=new int[n];
		System.out.print("Enter numbers: ");
		for(int i=0;i<A.length;i++) {
			A[i]=s.nextInt();
		}
		System.out.println("Enter key to search: ");
		int x=s.nextInt();
		for(int i=0;i<A.length;i++)
		{if(A[i]==x)
			{System.out.println("Element found at "+i);
			System.exit(0);}
		}
		System.out.println("Not Found!");
	}

}
