package swing;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

sdfsd
public class Swing_data_entry_form  implements ActionListener{

	String name=" ", gender=" ";
	int age;
	JFrame f1=new JFrame();
	JTextField n= new JTextField(20);
	JCheckBox g= new JCheckBox();
	JCheckBox m1=new JCheckBox("Male",true);
	JCheckBox m2=new JCheckBox("female",false);
	
	Choice c=new Choice();
	Label l1=new Label("Enter the name:- ");
	Label l2=new Label("Select Gender:- ");
	Label l3=new Label("Enter Age:- ");
	
	JButton b1=new JButton("Submit");
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
