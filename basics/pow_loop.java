import java.util.*;
public class MyClass {
   public static void main(String args[]) {
  System.out.print("Enter the Number ");
    Scanner an= new Scanner(System.in);
  int a=an.nextInt();
  for(int j=0;j<6;j++)
  System.out.println(a+" Raised to power "+j+" is = "+Math.pow(a, j));
  }}