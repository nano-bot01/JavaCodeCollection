package networking;

import java.net.*;


//UDP connection
public class udp_client {
	
	public static void main(String[] args) throws Exception{
		System.out.println("Client is running!!");
		
		DatagramSocket ds = new DatagramSocket();
		// instance of datagram socket
		
		String name= "data aa gya h bhai ";
		byte b[]= name.getBytes();
		// taking message and converting it to bytes

		int len= b.length;
		int port = 5550;
		InetAddress ip= InetAddress.getByName("localhost");
		//This method returns the address of the other computer
		// that this socket is connected to.
		
		DatagramPacket dp=new DatagramPacket(b,len, ip,port);
		// forms packet of information 
		ds.send(dp);
		
		System.out.println("SENT");
		
		//ds.close();
	}
}
