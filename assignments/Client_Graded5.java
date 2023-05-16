package Assignments;


import javax.swing.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Client_Graded5 {
    public static void main(String args[]) throws IOException {

        DatagramSocket client = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();

        byte msg[] = null;

        String input = JOptionPane.showInputDialog(null,
                "Enter Message","Message",JOptionPane.INFORMATION_MESSAGE);

            // convert the String input into the byte array.
            msg = input.getBytes();

            System.out.println("The Message sent to server is:-----");
            System.out.println(input);

            //Create the datagramPacket for sending the data.
            DatagramPacket DpSend = new DatagramPacket(msg, msg.length, ip, 6601);

            client.send(DpSend);

            byte[] receive = new byte[65535];
            DatagramPacket DpReceive = new DatagramPacket(receive, receive.length);
            client.receive(DpReceive);

            System.out.println("The Length of Message received from server--->"+data(receive));
    }

    public static StringBuilder data(byte[] a) {
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