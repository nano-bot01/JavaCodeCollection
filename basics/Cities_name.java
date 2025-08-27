import java.util.*;
public class Main {
	public static void main(String[] args) {
System.out.println(" Ankit Nainwal 1000014497");
Scanner input = new Scanner(System.in);System.out.print("Enter the first city: "); 
String city1 = input.nextLine();
System.out.print("Enter the second city: "); 
String city2 = input.nextLine();
if (city1.compareTo(city2) < 0) 
 {System.out.println("The cities in alphabetical order are:");
  System.out.println(" "+city1); 
  System.out.println(" "+city2);
 }
 else
{ System.out.println("The cities in alphabetical order are:");
  System.out.println(city2); 
  System.out.println(city1);}
	}
}