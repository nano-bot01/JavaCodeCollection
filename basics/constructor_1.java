import java.util.*;
public class cons {
	int x, y, z;
	cons(){
	    x=0;
	    y=1;
	    z=0;
	}
	void input(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number :");
	x=sc.nextInt();
	y=sc.nextInt();
	}
	void compute(){
	    z=x+y;
	}
	void display(){
    System.out.printf("The sum of %d and %d is %d \n", x, y, z) ;
	}
	public static void main(String[] args) {
	cons obj=new cons();
	obj.display();
	obj.input();
	obj.compute();
	obj.display();
	
	}
}