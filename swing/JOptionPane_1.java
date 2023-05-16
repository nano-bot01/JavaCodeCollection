package swing;

import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyEvent;

public class JOptionPane_1 extends WindowAdapter implements KeyListener{
	JFrame f;
	
	JOptionPane_1(){
		f=new JFrame("Registration Form");
		f.setSize(300,300);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		JOptionPane.showMessageDialog(f, "You are warned","Alert",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(f, "I am good","Information",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(f, "syntax error","Error message",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(f, "No option","No option",JOptionPane.NO_OPTION);
		//JOptionPane.showMessageDialog(f, "hello!");
		
		String name=JOptionPane.showInputDialog(f,"Enter Name");
		f.addWindowListener(this);
	}
	
	
	
	public void windowClosinkg(WindowEvent e) {
		int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
		if(a==JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	
	public static void main(String[] args) {
		 new JOptionPane_1();
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}
}
