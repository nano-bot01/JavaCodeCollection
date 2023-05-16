import java.util.*;
public class no_of_digits {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.print(" Enter a three digits number: ");
	int a=sc.nextInt();
	int dig=0, sum=0,b=a;
while(a!=0){
	dig=a%10;
	sum=sum+dig;
	a=a/10;
	}
	System.out.println(" Sum of the digits in  "+b+" is "+sum);
	
	}
}