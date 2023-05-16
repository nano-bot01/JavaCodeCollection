package oops;

interface A{
	int a=8;
	public static  final int b=9;
	
	abstract void m1();
	abstract void m2();
	
	
	}
interface B extends A{
	
}
class C implements A, Comparable<Object>{
	final int c=10;// this is constant for object only 
	static final int d=7;// this is constant for object as well as classes
	// static has only one copy which is passed in all the classes

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void m1() {
		// TODO Auto-generated method stub
		
	}

	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}

public class interface_example2 {
	public static void main(String[] args) {
		C c=new C();
		c.compareTo(c);
	}
	
}
