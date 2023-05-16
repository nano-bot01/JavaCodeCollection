import java.util.Scanner;
public class Main{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(" Ankit Nainwal , SAP ID:1000014497");
        System.out.println();
        System.out.println("----------------DECIMAL CHECKER------------------");
        System.out.println();

        System.out.print("Input Ist number: ");
        double a = in.nextDouble();
        System.out.println();
        System.out.print("Input another number: ");
        double b = in.nextDouble();

        a = Math.round(a * 10000);
        a = a/ 10000;

        b = Math.round(b * 10000);
        b = b / 10000;

        if (a == b)
        {
            System.out.println("They are the same up to four decimal places");
        }
        else
        {
            System.out.println("They are different");
         System.out.println(a+" and "+b);
        }
    }
}