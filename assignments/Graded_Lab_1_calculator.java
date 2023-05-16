package Assignments;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Graded_Lab_1_calculator {
    public static void main(String[] args) {

        //creating two variables for storing integers
        int x1=15,x2=10;

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setTitle("Basic Math operations");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.setSize(350,100);

        //button for adding
        JButton b1=new JButton("Add");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sum of "+x1+" and "+x2+" = "+(x1+x2));
            }
        });
        b1.setBounds(10,10,100,40);
        //button for subtracting
        JButton b2=new JButton("Subtract");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Difference of "+x1+" and "+x2+" = "+(x1-x2));
            }
        });
        b2.setBounds(120,10,100,40);
        //button for multiplication
        JButton b3=new JButton("Multiply");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Product of "+x1+" and "+x2+" = "+(x1*x2));
            }
        });
        b3.setBounds(230,10,100,40);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
    }
}