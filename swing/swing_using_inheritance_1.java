package swing;
import javax.swing.*;


public class swing_using_inheritance_1 extends JFrame	{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame ff;
	swing_using_inheritance_1(){
		JButton bb=new JButton("press");
		bb.setBounds(100,100,80,30);
		add(bb);
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new swing_using_inheritance_1();
	}
}
