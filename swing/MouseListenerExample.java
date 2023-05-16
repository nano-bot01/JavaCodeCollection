package swing;

import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerExample  implements MouseListener{  
    Label l;  
    JFrame f;
    JButton b;
    MouseListenerExample(){  
    	f=new JFrame("Mouse");
        l=new Label("Status");  
        l.setBounds(20,50,100,20);  
        b=new JButton("Enter");
        b.setBounds(90,90,100,100);
        b.addMouseListener(this); 
        
        f.add(l);  
        f.add(b);
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true); 
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new MouseListenerExample();  
}}
