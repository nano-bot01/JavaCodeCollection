package networking;

import java.net.*;
import java.util.*;
import java.io.*;

public class factorial_server {
	public static void main(String[] args) throws Exception{
		System.out.println("Waiting for client!");
		// waiting client for running 
		
		ServerSocket s=new ServerSocket(6600);
		Socket ss=s.accept();
		// wait for client 
		// instance of socket is returned by client to server
		
		DataInputStream in=new DataInputStream(ss.getInputStream());
		int n=in.readInt();
		// Input readed sent by client as number to find factorial
		
		int fact=1;
		for (int i = 1; i <= n; i++) {
			fact*=i;
		}
		// factorial calculated
		
		
		DataOutputStream out=new DataOutputStream(ss.getOutputStream());
		out.writeInt(fact);
		// factorial value is sent to client for output 
		
		s.close();
		// server is closed for now!
		}
		
	}

