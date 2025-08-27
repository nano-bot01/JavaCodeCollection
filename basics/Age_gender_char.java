import java.util.*;
public class Logical {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.print("Enter the Age :");
	int age=s.nextInt();
	System.out.print("Enter the Gender :");
	char gen=s.next().charAt(0);
	if(gen=='M'||gen=='m' && age>=21)
	System.out.println("Eligible To Marry Boy:");
else if (gen=='F'||gen=='f' && age>=18)
	System.out.println("Eligible To Marry Girl:");else 
	System.out.println("Grow Yourself first);");
	}
}