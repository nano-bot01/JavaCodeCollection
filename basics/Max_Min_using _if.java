import java.util.*;
public class maximum {
    public static void main(String args[]) {
      System.out.print("Enter the Number: ");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int max=a;
    if (max<b)
    max=b;
    if(max<c)
    max=c;
    if(max<a)
    max=a;
    System.out.println("the Maximum Number Is :"+max);
    int min=a;
    if(min>b)
    min=b;   
    if(min>c)
    min=c;
    if(min>a)
    min=a;
    System.out.println("The Minimum Number is : "+min);
	}
}