package networking;

import java.net.*;
import java.util.*;
import java.io.*;

public class factorial_client {
	public static void main(String[] args) throws Exception {
		System.out.println("Client Started! ");
		
		Socket s=new Socket("localhost",6600);
		// socket object is formed
		
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		// client will give output as number to find factorial
		
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=ss.nextInt();
		// Input taking of number 
		
		out.writeInt(n);
		// sent to server to calculate
		
		DataInputStream in=new DataInputStream(s.getInputStream());
		// for taking input from server
		int fact=in.readInt();
		// readed input
		System.out.println("the Factorial of "+n+" is: "+fact);
		
		s.close();
	
		
		
	}
	

}
