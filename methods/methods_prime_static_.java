package methods;
import java.util.*;

public class methods_prime_static_ {
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
 		if(isprime(n)) {
 			System.out.print(n+" is a prime number");
 	 	}	
 		else 
 			System.out.println(n +" is not a prime number ");
 		
 	}
}
