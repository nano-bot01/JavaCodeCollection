package programs;
import java.io.*;

public class file_handling_bufferReader {
	public static void main(String[] ar)
	{
	try
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rollno and name :");
		int roll=Integer.parseInt(br.readLine());  
		String name=br.readLine();
		FileWriter fw=new FileWriter("stud.txt");
		fw.write(roll + " "+name);
	fw.close();
	br.close();
	}catch(IOException e)
	{System.out.println("Device not found");}
	}
		

}
