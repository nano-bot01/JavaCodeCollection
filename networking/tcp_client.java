package networking;

import java.io.*;
import java.net.*;


// TCP socket Programming 
// 

public class tcp_client{
	
public static void main(String[] args) throws Exception{
	
	Socket s=new Socket("localhost",6666);
	// Instance of Socket class
	
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	// In tcp outputstream of client is connected to inputstream of server
	
	dout.writeUTF("hello server bkl");	// Message to sent
	dout.close();		// Close dataoutput stream
	s.close();			// Close Socket
	
	
	
}
}
