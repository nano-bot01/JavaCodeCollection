package Assignments;

public class Circles {
	int radius;
	Circles(){
		radius=10;
	}
	Circles(int radius){
		this.radius=radius;
	}
	void printData() {
		System.out.println("The Radius of Circle is "+radius);
	}
	void printArea() {
		System.out.println("The area of Circle is "+(22/7)*Math.pow(radius, 2));
	}
	void printPerimeter() {
		System.out.println("The perimeter of Circle is "+((22/7)*radius));
	}
	public static void main(String[] args) {
		Circles c1=new Circles();
		System.out.println("Object C1");
		c1.printData();
		c1.printPerimeter();
		c1.printArea();
		Circles c2=new Circles(40);
		System.out.println("\nObject C2");
		c2.printData();
		c2.printPerimeter();
		c2.printArea();
	}
}
