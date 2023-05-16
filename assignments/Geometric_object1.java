package Assignments;

import java.util.Date;

class GeometricObject{
	private String color;
	private Date dateCreated=new Date();
	//default constructor
	GeometricObject(){
		this.color="white";
		}
	//parameter constructor
	GeometricObject(String color){
		this.color=color;
		}
	public String getColor(){
			return this.color;
		}
	public Date getDate(){
			return this.dateCreated;
		}
}
class Rectangelee1 extends GeometricObject{
		private double length;
		private double breath;
		
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getBreath() {
			return breath;
		}
		public void setBreath(double breath) {
			this.breath = breath;
		}
	}
	class RightAngleTriangle extends GeometricObject{

		private double base;
		private double height;
		//default constructor
		RightAngleTriangle(){
			this.base=3.0;
			this.height=5.0;
}
		//parameter constructor
		RightAngleTriangle(double base,double height,String color){
			//initializing parameter constructor of super class
			super(color);
			this.setBase(base);
			this.setHeight(height);
				}
		//getter and setter of base
		public double getBase() {
			return this.base;
			}
		public void setBase(double base) {
			this.base = base;
			}
		//getter and setter of height
		public double getHeight() {
			return this.height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		//function to print area of the triangle
		public void getArea(){
				System.out.println("Area of triangle="+(this.getBase()*this.getHeight())/2);
		}
		//function to print all the data of the triangle
		public void printData(){
				System.out.println("Base of triangle is="+this.getBase());
					System.out.println("Height of triangle is="+this.getHeight());
		System.out.println(super.getDate());
		System.out.println("Colour of the triangle is "+super.getColor());
		}
}
public class Geometric_object1 {
	public static void main(String[] args) {
		//creating the default triangle
		RightAngleTriangle r1=new RightAngleTriangle();
		System.out.println("\nR1-----");
		r1.printData();
		r1.getArea();
		//creating the custom triangle
		RightAngleTriangle r2=new RightAngleTriangle(4,5,"red");
		System.out.println("\nR2-----");
		r2.printData();
		r2.getArea();
		}
	}
