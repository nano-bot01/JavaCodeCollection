package swing;
import javax.swing.*;
import java.awt.event.*;

public class Active_listner_1_JButton  {
	public static void main(String[] args) {
		JFrame j3=new JFrame("active");
		final JTextField tf=new JTextField("Click \"Submit\" Button");
		tf.setBounds(70,100,200,40);
		JButton b4=new JButton("Submit");
		b4.setBounds(100,200,100,40);
		j3.setLayout(null);
		j3.setSize(600,600);
		j3.setVisible(true);
		j3.add(b4);
		j3.add(tf);
		j3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b4.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									tf.setText("Your response have been submitted!");
								}				}
		);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Your response have not been submitted!");
			}				}
);
	}

	
}
