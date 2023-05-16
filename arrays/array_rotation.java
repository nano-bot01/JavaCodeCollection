package Arrays;

public class array_rotation {

	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("Enter the number of elements ");
		int n=s.nextInt();
		int temp=0;
		int ch=0;
		int A[]=new int[n];
		System.out.print("Enter numbers: ");
		for(int i=0;i<A.length;i++) {
			A[i]=s.nextInt();
		}
		System.out.println(" Left OR Right Shift? :\n"
				+ "{ Enter 0 for left and 1 for right } ");
		ch=s.nextInt();
		System.out.println("\nArray before Shift: ");
		for(int i=0;i<A.length;i++) {
			System.out.print("  "+A[i]);}
	
		if(ch==1)//Right shift 
		{
			temp=A[A.length-1];
			for(int i=A.length-1;i>0;i--) {
				A[i]=A[i-1];
				
			}
			A[0]=temp;
		}
		else if(ch==0) //Left Shift
		{	temp=A[0];
			for(int i=0;i<A.length-1;i++) {
			A[i]=A[i+1];
			
			}
			A[A.length-1]=temp;
		}
		else
			System.exit(0);	
	System.out.println("\nArray after Shift: ");
		
	for(int i=0;i<A.length;i++) {
		System.out.print("  "+A[i]);
	}
	}
}
