package Exceptions;

public class exception_handling_33 {
	void divide() throws ArithmeticException
	{
		int a=0;
		int b=10;
		int c=b/a;
		System.out.println("value of c: "+c);
	}
	public static void main(String a[])
	{
		exception_handling_33 t1=new exception_handling_33();
		try {
		t1.divide();}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

