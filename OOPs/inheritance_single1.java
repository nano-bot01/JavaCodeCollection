package oops;

class room{
	int len,br;
	public room(){
		System.out.println("default constructor of room");
	}
	room(int x,int y){
		System.out.println("parametarized constructor of room");
		len=x;
		br=y;
	}
	int area() {
		return len*br;
	}
	void setter() {
		len=20;
		br=30;
	}
}

class bedroom extends room{
	int height;
	bedroom (){
		System.out.println("default constructor of bedroom");
	}
	bedroom(int x,int y ,int z){
		super(x,y);
		System.out.println("parametarized constructor of bedroom");
		height=z;
		
	}
	int vol() {
		return len*br*height;
	}
	@Override
	int area() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class inheritance_single1 {

	public static void main(String[] args) {
		
	bedroom bd=new bedroom(50,90,80);
	System.out.println("The area of room1 is "+bd.area());
	room r=new room(50,60);
	//r.setter();
	System.out.println("The area of room1 is "+r.area());
	System.out.println("The volume of room1 is "+bd.vol());
	}
}
