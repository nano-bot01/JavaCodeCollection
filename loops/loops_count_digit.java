package loops_in_java;
import java.util.*;

public class loops_count_digit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the number ");
		int num=sc.nextInt();
		int count=0;
		int num1=num;
		while(num>0) {
			num=num/10;
			count++;
			
		}
		System.out.println("the number of digits in "+num1+" is "+ count);
	}

}
