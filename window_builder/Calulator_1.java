package window_builder;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class Calulator_1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calulator_1 frame = new Calulator_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calulator_1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ankit\\eclipse-workspace\\programs\\src\\window_builder\\icona.png"));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 619);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(240, 248, 255));
		textArea.setFont(new Font("Monospaced", Font.BOLD, 35));
		textArea.setText("");
		textArea.setBounds(5, 5, 415, 116);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 125, 415, 447);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("%");
		btnNewButton.setBounds(10, 10, 91, 60);
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		JButton btnx = new JButton("1/x");
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnx.setBackground(new Color(135, 206, 235));
		btnx.setBounds(111, 10, 91, 60);
		panel.add(btnx);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnC.setBackground(new Color(135, 206, 235));
		btnC.setBounds(212, 10, 91, 60);
		panel.add(btnC);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnX.setBackground(new Color(135, 206, 235));
		btnX.setBounds(313, 10, 91, 60);
		panel.add(btnX);
		
		JButton btnX_1 = new JButton("\u221Ax");
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnX_1.setBackground(new Color(135, 206, 235));
		btnX_1.setBounds(10, 80, 91, 60);
		panel.add(btnX_1);
		
		JButton btnNewButton_7 = new JButton("x\u00B2");
		btnNewButton_7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.setBackground(new Color(135, 206, 235));
		btnNewButton_7.setBounds(112, 80, 91, 60);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("x\u00B3");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8.setBackground(new Color(135, 206, 235));
		btnNewButton_8.setBounds(212, 80, 91, 60);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("\u00F7");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9.setBackground(new Color(135, 206, 235));
		btnNewButton_9.setBounds(313, 80, 91, 60);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_6_1 = new JButton("7");
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6_1.setBackground(new Color(135, 206, 235));
		btnNewButton_6_1.setBounds(10, 153, 91, 60);
		panel.add(btnNewButton_6_1);
		
		JButton btnNewButton_7_1 = new JButton("8");
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7_1.setBackground(new Color(135, 206, 235));
		btnNewButton_7_1.setBounds(112, 153, 91, 60);
		panel.add(btnNewButton_7_1);
		
		JButton btnNewButton_8_1 = new JButton("9");
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8_1.setBackground(new Color(135, 206, 235));
		btnNewButton_8_1.setBounds(212, 153, 91, 60);
		panel.add(btnNewButton_8_1);
		
		JButton btnNewButton_9_1 = new JButton("x");
		btnNewButton_9_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_9_1.setBackground(new Color(135, 206, 235));
		btnNewButton_9_1.setBounds(313, 153, 91, 60);
		panel.add(btnNewButton_9_1);
		
		JButton btnNewButton_6_2 = new JButton("4");
		btnNewButton_6_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6_2.setBackground(new Color(135, 206, 235));
		btnNewButton_6_2.setBounds(10, 223, 91, 60);
		panel.add(btnNewButton_6_2);
		
		JButton btnNewButton_7_2 = new JButton("5");
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7_2.setBackground(new Color(135, 206, 235));
		btnNewButton_7_2.setBounds(112, 223, 91, 60);
		panel.add(btnNewButton_7_2);
		
		JButton btnNewButton_8_2 = new JButton("6");
		btnNewButton_8_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8_2.setBackground(new Color(135, 206, 235));
		btnNewButton_8_2.setBounds(212, 223, 91, 60);
		panel.add(btnNewButton_8_2);
		
		JButton btnNewButton_9_2 = new JButton("-");
		btnNewButton_9_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9_2.setBackground(new Color(135, 206, 235));
		btnNewButton_9_2.setBounds(313, 223, 91, 60);
		panel.add(btnNewButton_9_2);
		
		JButton btnNewButton_6_3 = new JButton("1");
		btnNewButton_6_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6_3.setBackground(new Color(135, 206, 235));
		btnNewButton_6_3.setBounds(10, 293, 91, 60);
		panel.add(btnNewButton_6_3);
		
		JButton btnNewButton_7_3 = new JButton("2");
		btnNewButton_7_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7_3.setBackground(new Color(135, 206, 235));
		btnNewButton_7_3.setBounds(112, 293, 91, 60);
		panel.add(btnNewButton_7_3);
		
		JButton btnNewButton_8_3 = new JButton("3");
		btnNewButton_8_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8_3.setBackground(new Color(135, 206, 235));
		btnNewButton_8_3.setBounds(212, 293, 91, 60);
		panel.add(btnNewButton_8_3);
		
		JButton btnNewButton_9_3 = new JButton("+");
		btnNewButton_9_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9_3.setBackground(new Color(135, 206, 235));
		btnNewButton_9_3.setBounds(313, 293, 91, 60);
		panel.add(btnNewButton_9_3);
		
		JButton btnNewButton_6_3_1 = new JButton("1");
		btnNewButton_6_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6_3_1.setBackground(new Color(135, 206, 235));
		btnNewButton_6_3_1.setBounds(10, 363, 91, 60);
		panel.add(btnNewButton_6_3_1);
		
		JButton btnNewButton_7_3_1 = new JButton("0");
		btnNewButton_7_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7_3_1.setBackground(new Color(135, 206, 235));
		btnNewButton_7_3_1.setBounds(112, 363, 91, 60);
		panel.add(btnNewButton_7_3_1);
		
		JButton btnNewButton_8_3_1 = new JButton(".");
		btnNewButton_8_3_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_8_3_1.setBackground(new Color(135, 206, 235));
		btnNewButton_8_3_1.setBounds(212, 363, 91, 60);
		panel.add(btnNewButton_8_3_1);
		
		JButton btnNewButton_9_3_1 = new JButton("=");
		btnNewButton_9_3_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9_3_1.setBackground(new Color(135, 206, 235));
		btnNewButton_9_3_1.setBounds(313, 363, 91, 60);
		panel.add(btnNewButton_9_3_1);
	}
}
