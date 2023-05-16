package adv_java_classwork;

import java.util.*;
public class palindrome_string {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String rev="";
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			rev=ch+rev;
			
			
		}
		if(s.equals(rev)) {
			System.out.println(rev);
			System.out.println("This String is \"Palindrome\" ");
		}
		else {
			System.out.println(rev);
			System.out.println("Not palindrome");
		}
		
	}
}
