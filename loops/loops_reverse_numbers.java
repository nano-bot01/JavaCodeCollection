package loops_in_java;
import java.util.*;

public class loops_reverse_numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the num ");
		int num=sc.nextInt();
		int r,rev=0,x;
		x=num;
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}	
		System.out.println("The reverse of number is : "+rev);
		if(rev==x) {
			System.out.println(rev+" This Number is also Palindrome ");
		}
	}

}
