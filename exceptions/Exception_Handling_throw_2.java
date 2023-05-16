package Exceptions;

// for unchecked exceptions
public class Exception_Handling_throw_2 {
	public static void age(int age) {
		if(age<18){
			System.out.println("NOT eligebile to vote");
			throw new ArithmeticException("this is not eligible for voting");
		}
		else
			System.out.println("Elegible for voting");
	}
	public static void main(String[] args)  {
		age(4);
		System.out.println("done");
	}
}