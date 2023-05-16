package oops;

class A2{
	int i;
	A2(int i){
		this.i=i;
	}
	protected void m2() {
		System.out.println("The value of i is : "+i);
	}
}

class B2 extends A2{
	int j;
	B2(int j){
		super(j);
		this.j=j;
	}
	void m3() {
		System.out.println("The value of j is :"+j);
	}
}
public class this_keyword_2 extends B2{
	this_keyword_2(int j) {
		super(j);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		B2 obj1= new B2(9);
		obj1.m3();
		obj1.m2();
	}
	
	
}
