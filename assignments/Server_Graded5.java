package Assignments;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server_Graded5 {
    public static void main(String[] args) throws IOException
    {

        DatagramSocket server = new DatagramSocket(6601);
        InetAddress ip = InetAddress.getLocalHost();

        byte[] receive = new byte[65535];

        //create a DatagramPacket to receive the data.
        DatagramPacket DpReceive = new DatagramPacket(receive, receive.length);

            //receive the data in byte buffer.
            server.receive(DpReceive);

            System.out.println("Client:-" + data(receive));
            String n=Integer.toString(data(receive).length());

            System.out.println("The Length of message is--->"+n);

           // Clear the buffer
            receive = new byte[65535];

            //sending length to client
            receive=n.getBytes();

            DatagramPacket DpSend = new DatagramPacket(receive, receive.length,ip,DpReceive.getPort());

            server.send(DpSend);

    }

    // A utility method to convert the byte array
    // data into a string representation.
    public static StringBuilder data(byte[] a)
    {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0)
        {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}