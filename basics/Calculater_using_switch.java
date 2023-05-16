import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner r=new Scanner(System.in);
	System.out.println("Enter two Numbers");
	float a=r.nextFloat();
	float b=r.nextFloat();
	System.out.print("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Modules\n\n Enter Your Choice:- ");
	int ch=r.nextInt();
	switch(ch){
	case 1: {float add=a+b;
	             System.out.println(" The Sum of Two numbers is : "+add);
	             break;}
	case 2: {float sub=a-b;
	            System.out.println(" The difference of Two numbers is : "+sub); break;}
	case 3: {float mul=a*b;
            	System.out.println(" The product of Two numbers is : "+mul); break;}
    case 4: {float div=a/b;
                System.out.println(" The division of Two numbers is : "+div); break;}
     case 5: {float mod=a%b;
                 System.out.println(" The modules of Two numbers is : "+mod); break;}
      default: System.out.println(" Invalid Indput :( ");
	}
	}
}