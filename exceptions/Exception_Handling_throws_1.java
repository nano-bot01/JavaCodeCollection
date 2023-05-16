package Exceptions;
import java.io.*;

public class Exception_Handling_throws_1{
	void m() throws IOException{
		throw new IOException("device error");
	}
	void n() {
	try {
		System.out.println("exception occured in try");
		m();
	}
	catch(Exception e) {
		System.out.println("exception handled in catch");
	}
	}
	public static void main(String[] args) {
		Exception_Handling_throws_1 ob=new Exception_Handling_throws_1();
		ob.n();
		System.out.println("normal flow of program");
	}


}
