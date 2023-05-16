package swing;

import javax.accessibility.Accessible;
import javax.swing.*;

public class uncomplete extends JFrame  implements Accessible  {
	
	uncomplete(){
		JButton b=new JButton("Click");
		b.setBounds(100,100,150,80);
		setTitle("GUI program");
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new uncomplete();
	}

	
	
}
