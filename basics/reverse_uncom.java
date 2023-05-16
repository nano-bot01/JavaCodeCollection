import java.util.*;
public class reverse {
	public static void main(String[] args) {
    int rev=0, r;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the Number to reverse: ");
	int n=s.nextInt();
    while(n>0){
        r=n%10;
        rev=rev*10+r;
        n=n/10;}
 System.out.println(" The Reverse is : "+rev);
        
	}
}