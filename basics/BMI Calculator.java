import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.print("Enter the Weight in kg :");
	double kg=a.nextDouble();
	System.out.print("Enter height in m :");
	double h=a.nextDouble();
	double bmi=kg/Math.pow(h, 2);
	System.out.println("BMI = : "+(int)bmi);
	if(bmi<16) System.out.println(" Seriously Underweight ");
	else if(bmi>16&&bmi<18) 
	System.out.println(" Underweight");
	else if(bmi>18&&bmi<24)
	System.out.println("Normal Weight");
	else if(bmi>29&&bmi<34)
	System.out.println("Seriously Over Weight");
	else if(bmi>24&&bmi<29)
	System.out.println("Over Weight");
	else 
	System.out.println(" You are not human");
	
	
	}
}