package Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample1 {
	
	public static void main(String[] args) {
		BufferedReader objReader=null;
		try {
			String strCurrentLine;
			objReader=new BufferedReader(new FileReader("C:\\Users\\ankit\\eclipse-workspace\\programs\\src\\adv_java_classwork\\info.txt.txt"));
			while((strCurrentLine=objReader.readLine())!=null){
				System.out.println("\n\t"+strCurrentLine);
			}
		}
		catch (IOException e)	{
			e.printStackTrace();
		}
		finally {
			try {
				if(objReader!=null)
					objReader.close();
			 }
			catch (IOException ee) {
				ee.printStackTrace();
			}
		}
	}
}
