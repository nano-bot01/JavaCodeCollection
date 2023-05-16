package networking;

import java.net.InetAddress;
import javax.swing.JOptionPane;
public class url_lookup {
    public static void main(String args[])
    {
        String url = JOptionPane.showInputDialog("Enter URL");
        
        try{
            InetAddress inetHost = InetAddress.getByName(url);
            String hostName = inetHost.getHostName();
            JOptionPane.showMessageDialog(null, "Host name is: "+hostName+"\nIP Address is: "+inetHost.getHostAddress());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Unknown host or IP address");
        }
    }
}