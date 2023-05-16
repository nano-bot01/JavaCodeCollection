import java.util.*;
public class Main {
	static int fact(int n){
	    if(n==1||n==0)
	    return 1;
	    else 
	    return n*fact(n-1);
	   } 
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.print("Enter the number : ");
	int b=a.nextInt();
		System.out.println("The factorial of "+b+" is : "+fact(b));
	}
}