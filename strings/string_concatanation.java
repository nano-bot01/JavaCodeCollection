package string;
import java.util.Scanner;
public class string_concatanation {

	
	public static void main(String[] args) {
		String s,r;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st string : " );
		s=sc.nextLine();
		System.out.print("Enter 2nd string : " );
		r=sc.nextLine();
		String n=s.concat(r);
		System.out.println("The concated string is : "+ n);
		
	}
	}