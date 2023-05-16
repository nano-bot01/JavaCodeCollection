import java.util.*;
public class paracons {
	int x, y, z;
	paracons(){
	    x=1;
	    y=2;
	    z=0;
	}
	paracons(int a, int b){
	    x=a;
	    y=b;
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
	paracons obj=new paracons();
	System.out.println("Using default constructor:");
	obj.compute();
	obj.display();
	obj.input();
	obj.compute();
	obj.display();
	paracons obj1=new paracons(100,200);
	obj1.compute();
	System.out.println("Now using parameterized construcror ");
	obj1.display();
	obj1.input();
	obj1.compute();
	obj1.display();
	
	}
}