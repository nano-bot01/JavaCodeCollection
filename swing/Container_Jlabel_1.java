package swing;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Container_Jlabel_1 extends JComponent implements ActionListener{
	private Container c;
	private JFrame f;
	private JLabel l;
	private JTextField t;
	private JButton b;
	Container_Jlabel_1(){
		f=new JFrame("Phone Number");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = f.getContentPane();
		c.setLayout(null);	
		
		l=new JLabel("Enter the phone Number");
		l.setBounds(30,50,140,30);
		f.add(l);
		
		t=new JTextField();
		t.setBounds(190,50,100,30);
		f.add(t);
		
		b=new JButton("Sumbit");
		b.setBounds(110, 100, 100,30);
		f.add(b);
		b.setVisible(true);
		f.getContentPane().add(b);
		b.addActionListener(this);
		
		
		

	}
	public static void main(String[] args) {
		new Container_Jlabel_1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
			String str = t.getText();
			int count=0;
		      for(int i=0; i < str.length(); i++) {
		         Boolean flag = Character.isDigit(str.charAt(i));
		         if(flag) {
		        	 count++;
		        	 JOptionPane.showMessageDialog(null,"INVALID NUMBER \n"+t.getText());
		        	 
		         }
		         else {
		    	  JOptionPane.showMessageDialog(null,"Phone Number Submitted \n"+t.getText());
		         }
		      }
		}
	}
}
