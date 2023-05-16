package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


class userdefined_1 extends Exception{
	public userdefined_1(String str) {
		super(str);
	}
	
}


//for checked exceptions
public class Exception_Handling_throw_1 {

//	public static void file2() throws FileNotFoundException{
//		FileReader f2=new FileReader("C:\\Ankit\\abc.txt");
//		BufferedReader fileinput=new BufferedReader(f2);
//		throw new FileNotFoundException();
//		}
//	public static void main(String[] args) {
//		try {
//			file2();
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//			e.printStackTrace();
//		}
//	}

	//throw for user defined exceptions
	
	public static void main(String[] args) {
		try {
			throw new userdefined_1("this is user defined exceptions");
		}
		catch(userdefined_1 u) {
			System.out.println("Caught the exception");
			System.out.println(u.getMessage());
		}
}
}
