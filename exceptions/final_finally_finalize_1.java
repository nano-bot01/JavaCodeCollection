package Exceptions;

public class final_finally_finalize_1 {
	
	final int age= 20;
	void display () {
		//age=55;
		//error
		System.out.println("final variable called: "+age);
	}
	public static void main(String[] args) {
		final_finally_finalize_1 o=new final_finally_finalize_1();
		o.display();
		try {
			System.out.println("inside try block");
		}
		catch(ArithmeticException e) {
			System.out.println("handled");
		}
		finally {
			System.out.println("I'm done in finally method!");
		}
		o.finalize();
	}
	public void finalize() {
		System.out.println("Finalize called here!");
	}
}
