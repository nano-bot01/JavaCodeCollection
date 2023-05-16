package Exceptions;

public class exception_try_catch {

	public static void main(String[] args) {
		int a,b,c;
		try { 
			a=0;
			b=10;
			c=b/a;
			System.out.println("The value of c is : "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by Zero!");
		}
//		finally{
//			System.out.println("Problem SOlved");
//		}
	}
}
