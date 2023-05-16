package swing;
import javax.swing.*;
import java.awt.*;

public class BorderLayout_1 {
     
	JFrame jframe;    
	BorderLayout_1()  
	{  
	    jframe = new JFrame();    
	    
	    JButton btn1 = new JButton("NORTH");    
	    JButton btn2 = new JButton("SOUTH");    
	    JButton btn3 = new JButton("EAST");   
	    JButton btn4 = new JButton("WEST");    
	    JButton btn5 = new JButton("CENTER");  
	    JButton btn6 = new JButton("DOWN");  
	    jframe.setLayout(new BorderLayout(20, 15));  
	    jframe.add(btn1, BorderLayout.NORTH);    
	    jframe.add(btn2, BorderLayout.SOUTH);    
	    jframe.add(btn3, BorderLayout.EAST);    
	    jframe.add(btn4, BorderLayout.WEST);    
	    jframe.add(btn5, BorderLayout.CENTER);   
	    jframe.add(btn6, BorderLayout.EAST);   
	    jframe.setLayout(new GridLayout(2,2,30,30));
	    jframe.setSize(300,300);    
	    jframe.setVisible(true);    
	    jframe.getContentPane().setBackground(Color.RED);
	}    
	// main method  
	public static void main(String argvs[])   
	{    
	    new BorderLayout_1();    
	}    
}
