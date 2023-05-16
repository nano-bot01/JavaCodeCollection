package oops;

class Base3{
	int a;
//	{ 
//		System.out.println("init block");
//	} // init block is always executed first 
	public  Base3(int a) {
		this.a=a;
	}
	public void print1() {
		System.out.println(" a has value: "+a);
	}
	
	
}
class Child3 extends Base3{
	int a,b;
	public Child3(int a,int b) {
		super(a);
		this.a=a;
		this.b=b;
	}
	public void print() {
		System.out.println(" a is : "+a);
		System.out.println(" b is : "+b);
	}
}

public class constructor_chaining_1 {
	public static void main(String[] args) {
		Child3 c=new Child3(4,5);
	
		c.print();
		c.print1();
		System.out.println("USING object of Child 3\nthe value of a is : "+c.a+"	 b is : "+c.b);
		Base3 b=new Base3(3);
		b.print1();
		System.out.println("USING object of Base 3\nthe value of a is : "+b.a);
		
	
	}
}
