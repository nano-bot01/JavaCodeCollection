package programs;

class room1 {
	int len,br;
	room1(int x,int y){
		len=x;
		br=y;
	}
	int area() {
		return len*br;
	}
}

class bedroom1 extends room1 {
	int h;
	bedroom1 (int x,int y,int z){
		super(x,y);
		h=z;
	}
	int volume() {
		return len*br*h;
	}
}

public class Inheritance_single {

	public static void main(String[] args) {
		bedroom1 bd=new bedroom1(5,10,15);
		System.out.println("the area is : "+bd.area());
		System.out.println("the volume is : "+bd.volume());
	}

}
