package programs;
import java.util.*;

public class reverse__with_end_0 {
	public static void main(String[] args) {

		Boolean flag=false;
		int r;
		int rev=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0){
			r=n%10;
			if(r==0){
				flag=true;;
			}
			rev=rev*10+r;
			n=n/10;
			
		}

		System.out.print("The reverse is : ");
		if(flag)
			System.out.print("0"+rev);
		}
	}

