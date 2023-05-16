package swing;
import javax.swing.*;
public class first_swing_1 {
	

	
		public static void main(String[] args) {
			JFrame f=new JFrame("Intro");
			JButton b= new JButton("How are you");
			b.setBounds(80,100,130,40); 
			JButton k= new JButton("hiii");
			k.setBounds(230,100,100,40); 
			f.add(b);
			f.add(k);
			f.setSize(400,300);  
			f.setLayout(null);//using no layout managers  
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}


