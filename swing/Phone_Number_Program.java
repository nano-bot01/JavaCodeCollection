package swing;

import javax.swing.*;



public class Phone_Number_Program {
	public static void main(String[] args) {
		JFrame j4;
		JButton b4,b5;
		JLabel jl=new JLabel("Enter the Phone Number");
		j4=new JFrame("Phone Number Verifer");
			j4.setSize(500,750);
			j4.setVisible(true);
			j4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b4=new JButton("Submit");
		b5=new JButton("Clear");
		j4.add(b4,b5);
		j4.add(jl);
	}
}
