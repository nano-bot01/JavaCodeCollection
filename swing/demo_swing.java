package swing;

import java.awt.event.*;
import javax.swing.*;


public class demo_swing implements ActionListener,KeyListener{

	
	JFrame f;
	JButton b1,b2;
	JTextField t1,t2;
	JLabel j1;
	
	demo_swing(){
		f=new JFrame("demoone");
		j1 =new JLabel("Enter your name: ");
		j1.setBounds(50, 50, 100, 40);
		t1=new JTextField(" ");
		t1.setBounds(150,54 ,100 ,30);
		b1=new JButton("Submit");
		b1.setBounds(125,100,100,40);
		b1.addActionListener(this);
		t1.addKeyListener(this);
		
		f.add(b1);
		f.add(t1);
		f.add(j1);
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new demo_swing();
	}
	public void keyPressed(KeyEvent e) {
	    if (e.getKeyCode()==KeyEvent.VK_ENTER){
	    	JOptionPane.showMessageDialog(null , "You've Submitted: " + t1.getText());
	    }
	}
	public void keyTyped(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Submitted","Status", JOptionPane.INFORMATION_MESSAGE, null);
	}
}
