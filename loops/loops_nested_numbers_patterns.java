package loops_in_java;
import java.util.*;

public class loops_nested_numbers_patterns {

	public static void main(String[] args) {
		int n=0;
		System.out.print("Enter the rows :");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println();
			for (int k=1;k<i;k++)
				System.out.print(k);
		}
		
		int count=1;	
	System.out.println();
		for(int j=1;j<=n;j++) {
			System.out.println();
			for (int m=1;m<=j;m++)
			System.out.printf("%2d ",count++);
		}
		}	
}
