package networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//1. Write a program using socket programming to develop
//the client/ server application to calculate the Area of the 
//circle

public class find_area_server {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Waiting for client");
	
		ServerSocket s=new ServerSocket(6600);
		Socket ss=s.accept();
		
		System.out.println("Connection established");
		
		DataInputStream input=new DataInputStream(ss.getInputStream());
		double radius=input.readDouble();
		double area=Math.PI*radius*radius;
		
		DataOutputStream output= new DataOutputStream(ss.getOutputStream());
		output.writeDouble(area);
		
		
		s.close();
		
		
		
	}
}
