package Assignments;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;



public class FlowLayout_Manager implements ActionListener{
	
    public static void main(String args[])
    {
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JLabel l=new JLabel();
        l.setBounds(20,20,50,20);
        frame.add(l);
        JButton b1=new JButton("button 1");
        JButton b2=new JButton("button 2");
        JButton b3=new JButton("button 3");
        JButton b4=new JButton("button 4");
        JButton b5=new JButton("button 5");
        JButton b6=new JButton("button 6");
        b4.addActionListener(null);
        
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);

        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        frame.add(panel1);
        frame.add(panel2);

        frame.setSize(600,100);
        frame.setVisible(true);


    }
safas
	private JLabel l;

	@Override
	public void actionPerformed(ActionEvent e) {
		l.setText("hii");
		// TODO Auto-generated method stub
		
	}
}

