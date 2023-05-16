package loops_in_java;
import java.util.*;

public class loops_nested_star_acending {

	public static void main(String[] args) {
		int n=0;
		System.out.print("Enter the rows :");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println();
			for (int k=1;k<=i;k++)
				System.out.print("*");
		}
		}

}
