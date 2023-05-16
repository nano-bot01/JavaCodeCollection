package oops;

abstract class room1{
	int len,br;
	room1(){
		System.out.println("default cons called room1");
	}
	public room1(int x,int y) {
		System.out.println(" parametarsed room1 constructor called");
	}
	abstract int area();
}
class bedroo extends room1{
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}

	int h;
	bedroo(){
		System.out.println("bedroom1 cons called!");
	}
	bedroo(int x,int y,int z){
		super(x,y);
		h=z;
	}

	int area() {
		return len*br;
	}
	int vol() {
		return len*br*h;
}

public class abstract_example_1 {
	public void main(String[] args) {
		bedroo bb= new bedroo(10,20,30);
		room1 rr=new bedroo();
		System.out.println("The area is "+ rr.area());
		System.out.println("The area is "+ bb.area());
		System.out.println("The area is "+ bb.vol());
	}	
	}
}
