package Exceptions;

import java.io.*;

class parent{
	void m() throws IOException {
		System.out.println("Hello how are you");
	}
}


public class exception_handling_with_method_overriding extends parent{

	void m() throws IOException{
		System.out.println("Child Exception!!!");
	}
	public static void main(String[] args) {
		exception_handling_with_method_overriding p=new exception_handling_with_method_overriding();
		
		try{
			p.m();
		}
		catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
	}

}

