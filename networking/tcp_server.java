package networking;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;



// TCP socket Programming 
// needs two socket 
public class tcp_server {
	public static void main(String[] args) throws Exception{
		
		System.out.println("Waiting for Client");
		ServerSocket ss=new ServerSocket(6666);
		/*This object is used to establish communication with the 
		* clients. The java.net.ServerSocket class is used by server 
		* applications to obtain a port and listen for client requests. 
		*/
		
		Socket s=ss.accept();
		/*accept() method waits for the client. If clients 
		 connect with the given port number, it returns an instance 
		 of Socket */
		System.out.println("Connection is made!");

		DataInputStream input= new DataInputStream(s.getInputStream());
		/* After connection, communication occur using I/O streams.
		 * Client's OutputStream==> server's InputStream, 
		 * clients InputStream==> Server's InputStream,
		 * 
		 * As, TCP is two way connection , both sending and receiving occurs
		 * at the same time.
		 */
		// takes input from input stream 
		String a=(String)input.readUTF();
		// Reading encoder
		System.out.println("Mesage= "+a);
		ss.close();		//closes the server socket
		
		
}
}
