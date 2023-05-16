package swing;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Click_Counter_in_Swing implements ActionListener{
	
	JLabel label;
	JFrame frame;
	JPanel panel;
	int count =0;
	public Click_Counter_in_Swing() {
		JFrame frame=new JFrame();
		JButton button =new JButton("click me");
		frame.setSize(400,400);
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	count++;
        		label.setText("No of clicks : "+count);
            }
            });
		button.setBackground(Color.CYAN);
		
		label=new JLabel("No of clicks : 0 ");
		
		
		panel=new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50,50,20, 20));
		panel.add(label);
		panel.add(button);
		//panel.setLayout(new GridLayout(0,1));
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("gui");
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Click_Counter_in_Swing();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

