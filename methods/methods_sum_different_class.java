package methods;
import java.util.*;

class sum{
	int sumnum(int a,int b) {
		return a+b;
	}
}
public class methods_sum_different_class {
 	public static void main(String[] args) {
 		int a,b;
 		Scanner s=new Scanner(System.in);
		System.out.print("Enter the numebers : a : b : ");
 		a=s.nextInt();
 		b=s.nextInt();
 		sum obj=new sum();
 		System.out.println("The sum of numbers are : "+obj.sumnum(a,b));
 	}
}
