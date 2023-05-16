package swing;
import javax.swing.*;


public class swing_constructor {
	JFrame f;
	swing_constructor(){
		f=new JFrame("new");
		JButton b=new JButton("clickkkk");
		b.setBounds(100,100,80,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new swing_constructor();
}
}
