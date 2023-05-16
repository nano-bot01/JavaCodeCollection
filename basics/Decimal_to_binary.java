import java.util.*;

public class Main {
	public static void main(String[] args) {

   System.out.print("Enter number: ");
  Scanner e=new Scanner(System.in);
  int a=e.nextInt();

   // binary numbers are factor 2 based (1,2,4,8,16,32,64,128)
   // if statements run code if and only if the condition is true
   if (a >= 128){ System.out.print("1"); a -= 128; } else System.out.print("0");
   if (a >=  64){ System.out.print("1"); a -= 64; }  else System.out.print("0");
   if (a >=  32){ System.out.print("1"); a -= 32; } else System.out.print("0");
   if (a >=  16){ System.out.print("1"); a -= 16; } else System.out.print("0");
   if (a >=  8){ System.out.print("1"); a -= 8; } else System.out.print("0");
   if (a >=  4){ System.out.print("1"); a -= 4; }  else System.out.print("0");
   if (a >=  2){ System.out.print("1"); a -= 2; }  else System.out.print("0");
   if (a >=  1){ System.out.print("1"); a -= 1; }  else System.out.print("0");
}
	}
