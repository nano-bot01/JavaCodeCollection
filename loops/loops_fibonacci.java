package loops_in_java;
import java.util.*;


public class loops_fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the terms : ");
		n=sc.nextInt();
		System.out.print("fibonacci : "+a+" "+b+" ");
		for(int i=0;i<n;i++)
		{	c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
