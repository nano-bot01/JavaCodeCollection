package Assignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration_Form_4 {
	
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setLayout(null);
		String []str=new String[7];
		JLabel hd=new JLabel("Registration Form");
		JLabel l1 = new JLabel("Name:");
		JLabel l2 = new JLabel("Email-ID:");
		JLabel l3 = new JLabel("Create Password:");
		JLabel l4 = new JLabel("Confirm Password:");
		JLabel l5 = new JLabel("Country:");
		JLabel l6 = new JLabel("State:");
		JLabel l7 = new JLabel("Phone No:");
		hd.setBounds(50,10,200,70);
		hd.setForeground(Color.BLUE);
		l1.setBounds(100, 90, 40, 50);
		l2.setBounds(100, 140, 50, 50);
		l3.setBounds(100, 190, 120, 50);
		l4.setBounds(100, 240, 120, 50);
		l5.setBounds(100, 285, 50, 50);
		l6.setBounds(100, 335, 40, 50);
		l7.setBounds(100, 385, 70, 50);
		JTextField j1 = new JTextField();
		JTextField j2 = new JTextField();
		JPasswordField j3 = new JPasswordField();
		JPasswordField j4 = new JPasswordField();
		JTextField j5 = new JTextField();
		JTextField j6=new JTextField();
		JTextField j7 = new JTextField();
		j1.setBounds(400, 100, 100, 20);
		j2.setBounds(400, 150, 100, 20);
		j3.setBounds(400, 200, 100, 20);
		j4.setBounds(400, 250, 100, 20);
		j5.setBounds(400, 300, 100, 20);
		j6.setBounds(400, 350, 100, 20);
		j7.setBounds(400, 400, 100, 20);
		JButton b1=new JButton("Submit");
		JButton b2=new JButton("Clear");
		b1.setBounds(100,500,70,30);
		b2.setBounds(200,500,70,30);
		str[0]=j1.getText();
		str[1]=j2.getText();
		str[2]= String.valueOf(j3.getPassword());
		str[3]= String.valueOf(j4.getPassword());
		str[4]=j5.getText();
		str[5]=j6.getText();
		str[6]=j7.getText();
		
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if((j3.getText()).equals(j4.getText())) {
				JOptionPane.showMessageDialog(null, "Data Saved Successfully");
			}
			else{
				JOptionPane.showMessageDialog(null,"Re enter correct password");
				j3.setText(null);
				j4.setText(null);}
			}
			});
		b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				j1.setText(null);
				j2.setText(null);
				j3.setText(null);
				j4.setText(null);
				j5.setText(null);
				j6.setText(null);
				j7.setText(null);
				}
				});
		
			f.setSize(700,700);
			f.add(hd);
			f.add(l1);
			f.add(l2);
			f.add(l3);
			f.add(l4);
			f.add(l5);
			f.add(l6);
			f.add(l7);
			f.add(j1);
			f.add(j2);
			f.add(j3);
			f.add(j4);
			f.add(j5);
			f.add(j6);
			f.add(j7);
			f.add(b1);
			f.add(b2);
			f.setVisible(true);
			}
		}
