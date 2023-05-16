package Exceptions;

public class exception_handling_2  {

	private static int a;

	public static void main(String[] args) {
		try {
			a = 50/0;
		}
		catch(ArithmeticException e) {
			System.out.println("exception name- "+ e);
			System.out.println(" Message "+ e.getMessage());
		}
		finally {
			System.out.println("It was an Exception!!! ");
		}
		
	}
}
