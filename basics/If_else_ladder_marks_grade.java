import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the Numbers :");
	int marks= s.nextInt();
	if(marks>=90&&marks<100)
	System.out.println("Grade A");
	else if (marks>=80&&marks<90)
	System.out.println("Grade B");
	else if (marks>=70&&marks<80)
	System.out.println("Grade C");
	else if (marks>=60&&marks<70)
	System.out.println("Grade D");
	else if (marks<60)
	System.out.println("Fail");
	else if(marks>100)
	System.out.println("Invalid Input");	
	
	
	}
}