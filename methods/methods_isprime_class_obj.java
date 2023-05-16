package methods;
import java.util.*;

public class methods_isprime_class_obj {
	static boolean isprime(int n) {
		for(int i=2;i<n/2;i++){
			if(n%i==0) 
				return false;
			}
		return true;
		}	
 	public static void main(String[] args) {
 		int n;
 		Scanner s=new Scanner(System.in);
		System.out.print("Enter the numebers n : ");
 		n=s.nextInt();
 		methods_isprime_class_obj ob=new methods_isprime_class_obj();
 		if(ob.isprime(n)) {
 			System.out.print(n+" is a prime number");
 	 	}	
 		else 
 			System.out.println(n +" is not a prime number ");
 		
 	}
}
