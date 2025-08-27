import java.util.*;
public class Main {
	public static void main(String[] args) {
// area of circle
Scanner s =new Scanner(System.in);
System.out.println("Enter the Radius :");
float r=s.nextFloat();
System.out.println("The area is : "+(3.14*r*r));
System.out.println("The perimeter is : "+(6.28*r));
System.out.println("\n\n Enter Length and breath of Rectangle ");
float a=s.nextFloat();
float b=s.nextFloat();
System.out.println(" The area of Rectangle is : "+a*b) ;
System.out.println(" The Perimeter of Rectangle is : "+2*(a+b));
	}
}