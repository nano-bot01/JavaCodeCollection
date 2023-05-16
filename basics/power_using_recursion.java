import java.util.*;
public class Main {
	static int pow(int n,int m){
	    if(m==0)
	    return 1;
	    else 
	    return n*pow(n, m-1);
	   } 
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.print(" Enter the base  : ");
	int b=a.nextInt();
	System.out.print(" Enter power :");
	int p=a.nextInt();
	int r=pow(b, p);
		System.out.println("The number "+b+" raised to power "+p+" is : "+r);
	}
}