import java.util.*;
public class Main {
	public static void main(String[] args) {
	//program for finding greatest among 3
Scanner r=new Scanner(System.in);
System.out.println("Enter three unique Numbers : ");
int a=r.nextInt();
int b=r.nextInt();
int c=r.nextInt();
if(a>=b&&a>=c)
System.out.println(" a = "+a+" is Greatest :");
else if (b>=a&&b>=c) 
System.out.println(" b = "+b+" is Greatest :");
else 
System.out.println(" c = "+c+" is Greatest :");
	}
}