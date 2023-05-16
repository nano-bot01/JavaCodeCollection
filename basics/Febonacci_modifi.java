import java.util.*;
public class Feebonaci {
	public static void main(String[] args) {
    System.out.println("Enter the number you want till the series go:");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int t1=0,t2=1,x;
    for (int i = 1; i <= n; i++)
    {
        x=t1+t2; 
        t1=t2;
        t2=x; 
        if(t1%5==0)
        continue;
      System.out.printf("%d ",t1);
         }	
	}
}