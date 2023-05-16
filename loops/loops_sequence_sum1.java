package loops_in_java;
import java.util.*;

public class loops_sequence_sum1 {
	public static void main(String[] args) {
		double n,sum=0;
		Scanner s= new Scanner(System.in);
		n=s.nextFloat();
//		int i=1;
//		while(i<n) {
//			sum=(i/i+1)+sum;
//			i++;
//		}
		for (int i = 1; i <n; i++) {
			sum=sum+(i/i+1);	
			System.out.println(sum);
		}
		System.out.println(" the result is "+sum);
		
	}
	
}
