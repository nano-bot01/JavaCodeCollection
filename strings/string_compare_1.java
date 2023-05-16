package string;
import java.util.Scanner;
public class string_compare_1 {

	
	public static void main(String[] args) {
		String s,r;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st string : " );
		s=sc.nextLine();
		System.out.print("Enter 2nd string : " );
		r=sc.nextLine();
		int n=s.compareTo(r);
		if(n<0) {
			System.out.println("s string is smaller than r "+n);
		}
		else if(n==0) {
			System.out.println("Both string are Equal: "+n);
		}
		else 
			System.out.println("s string is Greater than r "+n);
		
	}
	}