package swing;
import java.awt.*;
import javax.swing.*;

public class JLabel_Frame_1 {
public static void main(String[] args) {
	JFrame j3=new JFrame("test 3");
	j3.setVisible(true);
	j3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j3.setBounds(100,100,1000,1200);
	
	Container c=j3.getContentPane();
//	JLabel label1=new JLabel("Username ");
//	label1.setBounds(100,50,250,80);
//	Font font=new Font("",Font.BOLD,30);
//	label1.setFont(font);
//	c.setLayout(null);
//	c.add(label1);
	
	//add image to JFrame
	ImageIcon ic=new ImageIcon("C:\\Users\\ankit\\eclipse-workspace\\programs\\src\\swing\\giga2.jpg");
	JLabel label2=new JLabel(ic);
	label2.setBounds(50,50,ic.getIconWidth(),ic.getIconHeight());
	c.add(label2);
	
	ImageIcon ic2=new ImageIcon("C:\\Users\\ankit\\eclipse-workspace\\programs\\src\\swing\\giga2.jpg");
	JLabel label3=new JLabel("Text",ic2,JLabel.CENTER);
	label3.setBounds(350,350,ic.getIconWidth(),ic.getIconHeight());
	c.add(label3);
	
	
	j3.setVisible(true);
}
}
