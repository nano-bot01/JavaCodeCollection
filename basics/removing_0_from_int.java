package programs;
import java.util.*;
public class removing_0_from_int {
	
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int idx = 0;
        int newNum = 0;
        int n = num;
        int d;
        while (n != 0) {
            d = n % 10;
            if (d != 0) {
                newNum =newNum+(int)(d * Math.pow(10, idx));
                idx++;
            }
            n /= 10;
        }
        
        System.out.println("Original number = " + num);
        System.out.println("New number = " + newNum);
    }
}
