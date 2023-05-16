package Exceptions;

public class Multiple_catch_blocks {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		try {
			int a[]=new int[4];
			a[6]=9;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("1: "+e);
			System.out.println("2: "+e.getMessage());
		}
		catch(Exception a) {
			System.out.println("Parents exception");
		}
	}
}
