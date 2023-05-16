package loops_in_java;
import java.util.*;

public class loops_nested_count {

	public static void main(String[] args) {
		int n=0,count=0;
		System.out.print("Enter the rows :");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for (int k=1;k<=n;k++)
				count++;
		}
		System.out.println("The number of loop executions are : "+count);	
	}
	
}