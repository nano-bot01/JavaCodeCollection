package Arrays;

public class arrray_second_max {

	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("Enter the number of elements ");
		int n=s.nextInt();
		int A[]=new int[n];
		int max1=A[0];
		int max2=A[0];
		System.out.print("Enter numbers: ");
		for(int i=0;i<A.length;i++) {
			A[i]=s.nextInt();
		}
		for(int i=0;i<A.length;i++) {
			if(A[i]>max1) 
			{	if(A[i]>max2)
					max2=max1;	
			max1=A[i];
			
		}
		}	
		System.out.println("The Maximum element is : "+max1);
		System.out.println("The Second Maximum element is : "+max2);
		
	}
}
