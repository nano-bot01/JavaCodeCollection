package swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ImageIcon_1_program_swing {
	
	
	public static void main(String[] args) {
		JFrame f4=new JFrame("Imageicon");
		JButton b4=new JButton(new ImageIcon("C:\\Users\\ankit\\eclipse-workspace\\programs\\src\\swing\\giga.jpg"));
		b4.setBounds(50,50,600, 600); 
		
		final JTextField t4=new JTextField();
		t4.setBounds(400,400,120,40);
		
		f4.add(t4);
		f4.add(b4);   
		f4.setSize(700,750);    
		f4.setLayout(null);    
		f4.setVisible(true);    
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t4.setText("This is \"GIGA CHAD\" ");
				}
	}
);
		
	}
}
