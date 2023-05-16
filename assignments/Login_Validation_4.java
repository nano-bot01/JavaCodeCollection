package Assignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_Validation_4 {
	public static void main(String[] args){
		JFrame f1=new JFrame();
		JFrame f2=new JFrame();
		JFrame f3 = new JFrame();
		JLabel l1=new JLabel("Name");
		JLabel l2=new JLabel("Username");
		JLabel l3=new JLabel("Password");
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JPasswordField t3=new JPasswordField();
		JTextField t4=new JTextField();
		JPasswordField t5=new JPasswordField();
		JButton b1=new JButton("Sign Up");
		JButton b2=new JButton("Sign In");
		JButton b3=new JButton("Sign Up");
		JButton b4=new JButton("Sign In");
		b1.setBounds(100,100,100,30);
		b2.setBounds(300,100,100,30);
		f2.setSize(700,700);
		l1.setBounds(100, 90, 40, 50);
		l2.setBounds(100, 140, 100, 50);
		l3.setBounds(100, 190, 120, 50);
		t1.setBounds(400, 100, 100, 20);
		t2.setBounds(400, 150, 100, 20);
		t3.setBounds(400, 200, 100, 20);
		t4.setBounds(400, 150, 100, 20);
		t5.setBounds(400, 200, 100, 20);
		b3.setBounds(400,300,100,30);
		b4.setBounds(400,300,100,30);
		b1.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
		f2.setLayout(null);
		b3.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
		if(t2.getText().equals("Ramesh")){
			JOptionPane.showMessageDialog(null,"Name Ramesh is already in our database ");
			t2.setText(null); }
		else{
			JOptionPane.showMessageDialog(null,t2.getText()+" have successfully registered");}
		}
		});
		f2.add(l1);
		f2.add(l2);
		f2.add(l3);
		f2.add(t1);
		f2.add(t2);
		f2.add(t3);
		f2.add(b3);
		f2.setVisible(true);
		}
		});
	b2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		f3.setLayout(null);
		f3.setSize(700,700);
		b4.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		if(t4.getText().equals("Ramesh")&&(t5.getText().equals("Root")))
		{
			JOptionPane.showMessageDialog(null,"Welcome"+t4.getText());
			} 
		else{
			JOptionPane.showMessageDialog(null," WrongUserName/Password");
			t4.setText(null);
			t5.setText(null);
			}
			}
		});
		f3.add(l2);
		f3.add(l3);
		f3.add(t4);
		f3.add(t5);
		f3.add(b4);
		f3.setVisible(true);
		}
		});
		f1.setLayout(null);
		f1.setSize(600,300);
		f1.add(b1);
		f1.add(b2);
		f1.setVisible(true);
		}
	}
