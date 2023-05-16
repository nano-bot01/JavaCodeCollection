package loops_in_java;
import java.util.*;

public class loops_geometric_progressions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the term ");
		int num=sc.nextInt();
		System.out.print("enter the a ");
		int a=sc.nextInt();
		System.out.print("enter the r ");
		int r=sc.nextInt();
		int term=a;
		int i=0;
		System.out.print("the gp is  ");
		while(num>i) {
			System.out.print(term+" ");
			term*=r;
			i++;
		}	
	}

}
