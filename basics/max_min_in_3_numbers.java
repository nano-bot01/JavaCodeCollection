import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      System.out.print("Enter the Numbers: ");
     Scanner im = new Scanner(System.in);
     int a= im.nextInt();
     int b= im.nextInt();
     int c= im.nextInt();
     int max=Math.max(a,Math.max(b,c));
    int min=Math.min(a,Math.min(b,c));
      System.out.println(" The Maximum of three is :" +max);
     System.out.println(" The Minimum of three is :" +min);
     
    }
}
     