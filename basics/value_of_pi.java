import java.util.*;
public class Main {
	public static void main(String[] args) {
//program for calculating value of pi
Scanner s =new Scanner(System.in);
System.out.println("Enter the Number of terms :");
int n=s.nextInt();
double pi=0;
for(int i=0;i<=n;i++)
pi=3*(1-(1/(2*i+1)));
System.out.println("The Pi is :"+pi);


	}
}