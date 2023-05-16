package Assignments;

public class Rectangle {
		int length,breath;
		
		Rectangle(){
			length=10;
			breath=20;
			System.out.println("default constructor \nLenght= "+length+"\nBreath= "+breath);
		}
		
		Rectangle(int len,int br){
			length=len;
			breath=br;
			System.out.println("perametraized constructor\nLength= "+length+"\nBreath= "+breath);
		}
		void printData() {
			System.out.println("Length= "+length+"\n"+"Breath = "+breath);
			
		}
		void printPerimeter() {
			int peri=2*(length+breath);
			System.out.println("The Perimeter is "+peri);
		}
		void printArea() {
			int area=length*breath;
			System.out.println("The area is "+area);
		}
		
	public static void main(String[] args) {
		
			System.out.println("First Object\n");
			Rectangle r1=new Rectangle();
			r1.printData();
			r1.printPerimeter();
			r1.printArea();
			System.out.println("\nSecond Object\n");
			Rectangle r2=new Rectangle(40,100);
			r2.printData();
			r2.printPerimeter();
			r2.printArea();
	}

}
