package swing;
import javax.swing.*;

public class Jframe_example_1 {

	
		public static void main(String[] args) {
			JFrame frame=new JFrame("Test");
			JButton br=new JButton("Press me");
			
			br.setBounds(40,40,100,60);
			frame.setSize(400,300);
			frame.setVisible(true);
			frame.setLayout(null);
			frame.getContentPane().add(br);
//			frame.add(br);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
