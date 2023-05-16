import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the Range : Max >Min");
    int num;
	int max=s.nextInt();
	int min=s.nextInt();
	int range=max-min+1;
	System.out.println("The Random Numbers are: ");
	for(int j=0;j<10;j++)
    System.out.println(num=(int)(range*Math.random()+min));
	
//	int max=s.nextInt();
	}
}