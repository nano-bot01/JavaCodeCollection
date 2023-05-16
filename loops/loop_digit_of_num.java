package loops_in_java;
import java.util.*;

public class loop_digit_of_num {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the num ");
		int num=sc.nextInt();
		int r;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			System.out.print(r+" ");
		}	
	}

}
