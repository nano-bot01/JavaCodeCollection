import java.util.*;
public class Main {
	static int add(int n){
	    if(n==0)
	    return n;
	    else 
	    return n+add(n-1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the term :");
		int n=s.nextInt();
		int r=add(n);
		System.out.printf("The sum of first %d natural number is : %d",n,r);
		
	}
}