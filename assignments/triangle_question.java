package Assignments;
import java.util.*;

interface Triangle1{
	double Area();
	double Perimeter();
}
abstract class Isosceles implements Triangle1{
	private double LongSide;
	private double EqualSide;
	
	public double getLongSide() {
		return LongSide;
	}
	public void setLongSide(double longSide) {
		LongSide = longSide;
	}
	public double getEqualSide() {
		return EqualSide;
	}
	public void setEqualSide(double equalSide) {
		EqualSide = equalSide;
	}
	public double Perimeter() {
		return ((2*this.getEqualSide())+this.getLongSide());
	}
}
interface Right extends Triangle1{
    double[]Angles();
}

class RightIsosceles1 extends Isosceles implements Right{
    public double Area(){
        return (this.getLongSide()*this.getEqualSide())/2;
    	}

   
    public double[] Angles() {
        double[] interior_angles=new double[3];
        interior_angles[0]=90.0;
        interior_angles[1]=45.0;
        interior_angles[2]=45.0;
        return interior_angles;
    }
}


public class triangle_question {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        //creating object of the RightIsosceles
        RightIsosceles1 obj=new RightIsosceles1();
        System.out.print("\tEnter the value of Equal sides: ");
        obj.setEqualSide(sc.nextDouble());
        System.out.print("\tEnter the value of Long side: ");
        obj.setLongSide(sc.nextDouble());

        //printing the values
        System.out.println("\n\tPerimeter of the triangle is: "+obj.Perimeter());
        System.out.println("\tArea of the triangle is: "+obj.Area());
        System.out.print("\tInterior angles of triangle are : ");
        System.out.println(obj.Angles()[0]+", "+obj.Angles()[1]+", "+obj.Angles()[2]);
}

	}
