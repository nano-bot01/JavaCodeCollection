package networking;

import java.net.*;
import java.io.*;
import java.util.*;


public class find_area_client {
	
	public static void main(String[] args) throws Exception{
		System.out.println("Client Started!");
		
		Socket s=new Socket("localhost",6600);
		
		DataOutputStream output=new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of radius: (in meters) ");
		
		double radius=sc.nextDouble();
		output.writeDouble(radius);
		
		DataInputStream input=new DataInputStream(s.getInputStream());
		double area=input.readDouble();
		System.out.println("The area of circle is: "+area+ " meter square");
		
		
		s.close();
		
	}
	
}
