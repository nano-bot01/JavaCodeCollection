import java.util.*;
public class Main {
	static int gcd(int n,int m){
	    if(m==0)
	    return n;
	    else 
	    return gcd(m, n%m);
	   } 
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.print(" Enter 1st number  : ");
	int b=a.nextInt();
	System.out.print(" Enter 2nd number  :");
	int p=a.nextInt();
	int r=gcd(b, p);
		System.out.println("The gcd of "+b+" and "+p+" is : "+r);
	}
}