import java.util.*;
public class cm_to_feet {
	public static void main(String[] args) {
    System.out.print("Enter the height in cm : ");
    Scanner b=new Scanner(System.in);
    double cm=b.nextDouble();
    double feet=cm/30.48;
    double inche= (cm%30.48)/2.54;
    System.out.println(" The length in Feet and Inches is : feet= "+(int)feet+" inche= "+(int)inche);
    
	}
}