package Arrays;

public class array_search_more_than_one_element {

	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		int A[]= {2,2,3,4,5,6,5,7,8,4,7,8,4,3,2,4,3,4,5,6,3,7,8,2,9};
		int count=0;
		int b[]=new int[30];
		System.out.println("Enter key to search: ");
		int x=s.nextInt();
		for(int i=0;i<A.length;i++)
		{if(A[i]==x)
			{count++;
			b[i]=i+1;
			
			}
		}
		System.out.println("Element found  at position:");
		for(int i=0;i<b.length;i++)
		System.out.print(" "+b[i]);
		System.out.println("\nTotal "+count+" Index found for "+x);
	}
	}
