package Exceptions;

public class array_index_out_of_bounds {
	public static void main(String[] args) {
		
		try {
			int a[] =new int[5];
			a[6]=6/a[6];
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception ");
			System.out.println(e);
		}
		catch(ArithmeticException e)  {
			System.out.println("Arithmetic Exception");
			System.out.println(e.getMessage());
		}
	}
}
