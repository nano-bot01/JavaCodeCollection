package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseListener_dots extends JFrame implements MouseListener{

	MouseListener_dots(){
		addMouseListener(this);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setBackground(Color.green);
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g=getGraphics();
		g.setColor(Color.CYAN);
		g.fillOval(e.getX(), e.getY(), 20,20);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Graphics g=getGraphics();
		g.setColor(Color.red);
		g.fillOval(e.getX(), e.getY(), 20,20);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new MouseListener_dots();
	}

}
