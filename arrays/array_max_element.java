package Arrays;

public class array_max_element {

	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("Enter the number of elements ");
		int n=s.nextInt();
		int A[]=new int[n];
		int max=A[0];
		System.out.print("Enter numbers: ");
		for(int i=0;i<A.length;i++) {
			A[i]=s.nextInt();
		}
		for(int i=0;i<A.length;i++) {
			if(A[i]>max) {
				max=A[i];
			}
		}
		System.out.println("The Maximum element is : "+max);
	}

}
