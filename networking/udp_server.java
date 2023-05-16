package networking;

import java.net.*;

//UDP connection
/* It is a one way client and server communication. Client sends a 
 * message to server, and server reads and prints it .
 * classes used: 1. Socket 2. ServerSocket
 */


public class udp_server{
	public static void main(String[] args) throws Exception{
		
		System.out.println("Waiting for Client");
		
		DatagramSocket ds = new DatagramSocket(5550);
		// only one socket is needed for data transmission
		byte b[] = new byte [100];
		// for fetching the information sent by client
		
		DatagramPacket dp=new DatagramPacket(b,100);
		// object of datagram packet and data, limit as parameters
		
		ds.receive(dp);
		String str=new String(b);
		//byte conversion to String
		
		System.out.println(str);
		
//		ds.close();
		
	}
}
