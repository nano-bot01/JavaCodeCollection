package loops_in_java;
import java.util.*;

public class loops_Armstrong_numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the num ");
		int num=sc.nextInt();
		int sum = 0,r;
		int num2=num;
		
		while(num>0) {
			r=num%10;
			sum+=r*r*r;
			num=num/10;
		}
		if(sum==num2) {
			System.out.println("This is Armstrong Number : "+sum);
		}
		else 
			System.out.println("Not an asnstrong Number: "+sum);
	}
}
