package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Mswing implements ActionListener {
	private JFrame j2;
	private Container c;
	private JLabel label1, label2, result;
	private JTextField t1, t2;
	private JButton ad, sub, mul, div;

	Mswing() {
		j2 = new JFrame();
		j2.setTitle("Simple Calculator");
		j2.setSize(400, 400);
		j2.setLocationRelativeTo(null);
		j2.setVisible(true);
		j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = j2.getContentPane();
		c.setLayout(null);

		label1 = new JLabel("First Number: ");
		label1.setBounds(10, 20, 100, 20);
		c.add(label1);

		label2 = new JLabel("Second Number: ");
		label2.setBounds(10, 50, 100, 20);
		c.add(label2);

		t1 = new JTextField();
		t1.setBounds(120, 20, 70, 20);
		c.add(t1);

		t2 = new JTextField();
		t2.setBounds(120, 50, 70, 20);
		c.add(t2);

		ad = new JButton("+");
		ad.setBounds(10, 80, 50, 30);
		c.add(ad);
		ad.setVisible(true);

		sub = new JButton("-");
		sub.setBounds(70, 80, 50, 30);
		c.add(sub);
		sub.setVisible(true);

		mul = new JButton("x");
		mul.setBounds(130, 80, 50, 30);
		c.add(mul);
		mul.setVisible(true);

		div = new JButton("/");
		div.setBounds(190, 80, 50, 30);
		c.add(div);
		div.setVisible(true);

		result = new JLabel("Result : ");
		result.setBounds(85, 150, 120, 30);
		c.add(result);
		result.setVisible(true);

		ad.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);

	}

	@Override
	
		public void actionPerformed(ActionEvent e) {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			if (e.getSource() == ad) {
				int x = a + b;
				result.setText("Result = " + x);
			}
			if (e.getSource() == sub) {
				int x = a - b;
				result.setText("Result = " + x);
			}
			if (e.getSource() == mul) {
				int x = a * b;
				result.setText("Result = " + x);
			}
			if (e.getSource() == div) {
				int x = a / b;
				result.setText("Result = " + x);
			}
		}
	
}
	

public class Calculator {
	public static void main(String[] args) {
		
		try{
			new Mswing();
		}
		catch(Exception e) {
			System.exit(0);
			System.out.println(e);
		}
	}
}
