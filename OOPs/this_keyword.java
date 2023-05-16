package oops;

class box {

	int len,br;
	public box(int l,int b){
		this.len=l;
		this.br=b;
		// refer to len and br of box class 
	}
	int area() {
		return this.len*this.br;
		// refer to len and br of box class
	}
}
class box2 extends box{
	int h;
	box2(int l,int b,int h){
		super(l,b);
		//  initialize variables of len and br of box class
		System.out.println("box2 constructor!");
		this.h=h;
		// refer to h of box2 class
	}
	int volume() {
		return this.len*this.br*this.h;
	}
}
public class this_keyword {
	public static void main(String[] args) {
		box b=new box(5,6);
		System.out.println("the area is "+b.area());
		box2 b2=new box2(7,8,9);
		System.out.println("the area is "+b2.area());
		System.out.println("the Volume is "+b2.volume());
	}
}
