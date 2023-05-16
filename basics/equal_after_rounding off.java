import java.util.*;
public class Main {
	public static void main(String[] args) {
	System.out.println("Enter two Floating point number with 4 digits after decimal: ");
	Scanner n=new Scanner(System.in);
	double n1=n.nextDouble();
	double n2=n.nextDouble();
	double r1, r2; // after round off 
	r1=Math.round(n1*10000.0);
	r1=r1/10000;
	r2=Math.round(n1*10000);
	r2=r2/1000;
	if (r1==r2)
    System.out.println(" Same "+ r1);
    else 
    System.out.println(" Different Numbers : ");
	
	
	
	}
}