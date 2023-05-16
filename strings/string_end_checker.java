package string;
import java.util.Scanner;
public class string_end_checker {

	
	public static void main(String[] args) {
		String s,r;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st string : " );
		s=sc.nextLine();
		System.out.print("Enter 2nd string : " );
		r=sc.nextLine();
		String n="it";
		boolean b=s.endsWith(n);
		boolean c=r.endsWith(n);
		System.out.println(s +" ends with "+ n+ " ? "+b);
		System.out.println(r +" ends with "+ n+ " ? "+c);
	}
	}