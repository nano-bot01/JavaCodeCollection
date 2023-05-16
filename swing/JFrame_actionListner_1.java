package swing;
import javax.swing.*;
import java.awt.event.*;

public class JFrame_actionListner_1 {
	JButton b;
	void go() {
		JLabel tf1=new JLabel();
		tf1.setBounds(50,50,150,30);
		JLabel tf2=new JLabel();
		tf2.setBounds(50,90,150,30);
		JFrame j=new JFrame("Ankit");
		j.setVisible(true);
		j.setLayout(null);
		j.setSize(300,300);
		j.setLocationRelativeTo(null);
		
		b=new JButton("click");
		b.setBounds(120,150,60,40);// sets boundary where format is (x,y,width, height)
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.getContentPane().add(tf1);
				tf1.setText("Welcome Here!!");}
			}	);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.getContentPane().add(tf2);
				tf2.setText("Hello how are you!");}
			}	);
		
		j.getContentPane().add(b);// for adding button in frame 
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //window will close in exit
	}
	public static void main(String[] args) {
		JFrame_actionListner_1 obj=new JFrame_actionListner_1();
		obj.go();
		
	}
	
}
