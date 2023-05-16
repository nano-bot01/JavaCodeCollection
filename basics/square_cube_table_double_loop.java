import java.util.*;
public class Main {
	public static void main(String[] args) {
	//program for printing power tables
	Scanner e=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int x=e.nextInt();
	System.out.println("x    x^2    x^3");
	for(int i=2;i<x;i++)
	{System.out.println();
	for(int j=1;j<4;j++)
	{ System.out.printf("%d    ",(int)Math.pow(i,j));
	}
	}
	}
}