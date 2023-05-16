package loops_in_java;
import java.util.*;

public class loops_arthmatic_progression {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the term ");
		int num=sc.nextInt();
		System.out.print("enter the a ");
		int a=sc.nextInt();
		System.out.print("enter the d ");
		int d=sc.nextInt();
		int term=a;
		int i=0;
		while(num>i) {
			System.out.print(term+" ");
			term+=d;
			i++;
		}	
	}

}
