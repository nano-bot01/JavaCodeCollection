package swing;
import java.awt.*;
import javax.swing.*;

public class MyFirstFrame_1 {
	public static void main(String[] args) {
		JFrame frame1=new JFrame("test1");	
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame1.setSize(600,400);
//		frame1.setLocation(100,100);
		frame1.setBounds(100,100,500,400);
		frame1.setTitle("Documents");
		
		ImageIcon icon2=new ImageIcon("C:\\Users\\ankit\\eclipse-workspace\\programs\\src\\swing\\giga.jpg");
		frame1.setIconImage(icon2.getImage());
		
		Container c=frame1.getContentPane();
		c.setBackground(Color.GREEN);
		frame1.setResizable(false);
		
	}
}
