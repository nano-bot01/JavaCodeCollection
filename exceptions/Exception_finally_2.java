package Exceptions;

public class Exception_finally_2 {
	
	public static void main(String[] args) {
	//When no exception occurs
		try {
			int a = 4/4;
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this is finally block ");
		}
	//When no catch is executed
//		try {
//			int b=6/0;
//		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("this is again finally block");
//		}
		// When one block is executed
		try {
			int c = 5/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		finally {
			System.out.println("this is again again finally block");
		}
	}
	
}
