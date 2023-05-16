package methods;
import java.util.*;

public class methods_add_num {
	static int sum(int a,int b) {
		return a+b;
	}
	
	
 	public static void main(String[] args) {
 		int a,b;
 		Scanner s=new Scanner(System.in);
		System.out.print("Enter the numebers : a : b : ");
 		a=s.nextInt();
 		b=s.nextInt();
 		System.out.println("The sum of numbers are :"
 				+ " "+sum(a,b));
 	}
}
