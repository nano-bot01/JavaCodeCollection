package Exceptions;

public class Nested_try_blocks {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("going to divide by 0");
				int b=39/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				System.out.println("going to increase size of array");
				int a[]=new int[5];
				a[5]=4;
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println("this is outer catch , exception handled");
		}
	}
}
