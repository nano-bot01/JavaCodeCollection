package swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class java_project_linlist{
    public static void main(String[] args) {

        //creating linked list to store variables
        LinkedList<Integer> list=new LinkedList<Integer>();

        //storing 10 random values into list initially
        for(int i=0;i<10;i++){
            int num=(int)(Math.random()*100+1);
            list.add(num);
        }

        //creating JFrame object
        JFrame frame=new JFrame();
        frame.setTitle("Mini Project");
        frame.setSize(550,500);
        JLabel label=new JLabel("  --LIST--"); 
        // creating new label of heading
        //Dimension d= new Dimension(80,30);
//      label.setPreferredSize(d);
        label.setPreferredSize(new Dimension(80,30));
        label.setFont(new Font("Monospace",Font.BOLD,20));
        label.setAlignmentX(FlowLayout.CENTER);
        frame.add(label);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,150,15));
        
        //creating JTextField object
        JTextField field=new JTextField();
        //setting dimension and font
        field.setPreferredSize(new Dimension(400,100));
        field.setFont(new Font("Monospace",Font.BOLD,20));
        //setting field as non editable
        field.setEditable(false);
        //setting background color
        field.setBackground(Color.orange);
        //setting text alignment to center
        field.setHorizontalAlignment(JTextField.CENTER);

        //creating string buffer to convert
        //list elements to string
        StringBuffer str=new StringBuffer();

        //converting list elements to string
        //and adding them to the end of StringBuffer
        str.append("{ ");
        for(int i=0;i< list.size();i++){
           str.append(list.get(i)+", ");
        }
        str.deleteCharAt(str.length()-2);
        // Removing last extra comma
        str.append("}");
        //appending braces

        //setting text of field
        field.setText(str.toString());


        //creating Radio Buttons
        
        JRadioButton stack=new JRadioButton("Stack");
        stack.setPreferredSize(new Dimension(100,70));
        stack.setBackground(Color.getHSBColor(40, 100,100));
        stack.setFont(new Font("Times_New_Roman",Font.BOLD,20));

        JRadioButton queue=new JRadioButton("Queue");
        queue.setPreferredSize(new Dimension(100,70));
        queue.setBackground(Color.getHSBColor(200, 100,100));
        queue.setFont(new Font("Times_New_Roman",Font.BOLD,20));

        //creating button group for working of radio buttons
        ButtonGroup group=new ButtonGroup();
        group.add(stack);
        group.add(queue);

        //creating JButtons for operations
        JButton push=new JButton("Push");
        JButton pop=new JButton("Pop");
        JButton add=new JButton("Add");
        JButton delete=new JButton("Delete");

        //setting size and dimension for buttons
        push.setPreferredSize(new Dimension(100,50));
        pop.setPreferredSize(new Dimension(100,50));
        add.setPreferredSize(new Dimension(100,50));
        delete.setPreferredSize(new Dimension(100,50));

        //setting text and fonts in buttons
        push.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        pop.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        add.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        delete.setFont(new Font("Times_New_Roman",Font.BOLD,20));

        //creating a JText field to show status
        JTextField status=new JTextField("Status");
        status.setPreferredSize(new Dimension(400,50));
        status.setBackground(Color.green);
        status.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        status.setHorizontalAlignment(JTextField.CENTER);
        status.setEditable(false);


        //adding logic to push button
        push.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(stack.isSelected()){
                    try {
                        int value = Integer.parseInt(JOptionPane.showInputDialog("Enter number to push:"));
                        list.add(value);

                        //updating text field
                        StringBuffer str1=new StringBuffer();
                        str1.append("{ ");
                        for(int i=0;i< list.size();i++){
                            str1.append(list.get(i)+", ");
                        }
                        str1.deleteCharAt(str1.length()-2);
                        // Removing last extra comma
                        str1.append("}");
                        field.setText(str1.toString());
                        status.setText(" Pushed "+value+" to List");

                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Enter Only Integer to Push","Error",JOptionPane.WARNING_MESSAGE);
                    }
                }
                else{
                    //showing error option in case of invalid choice
                    JOptionPane.showMessageDialog(null,"Invalid Operation!\nSelect Stack For Push Operation","Error Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        //adding logic to pop button
        pop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(stack.isSelected()){
                    int value=list.removeLast();
                    //updating text field
                    StringBuffer str1=new StringBuffer();
                    str1.append("{  ");
                    for(int i=0;i< list.size();i++){
                        str1.append(list.get(i)+", ");
                    }
                    str1.deleteCharAt(str1.length()-2);
                    // Removing last extra comma
                    str1.append("}");
                    field.setText(str1.toString());
                    status.setText(" Popped "+value+" from List");
                }
                else{
                    //showing error option in case of invalid choice
                    JOptionPane.showMessageDialog(null,"Invalid Operation!\nSelect Stack for Pop Operation","Error Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        //adding logic to add button
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(queue.isSelected()){
                    try{
                    int value=Integer.parseInt(JOptionPane.showInputDialog("Enter number add:"));
                    list.add(value);
                    //updating text field
                    StringBuffer str1=new StringBuffer();
                    str1.append("{ ");
                    for(int i=0;i< list.size();i++){
                        str1.append(list.get(i)+", ");
                    }
                    str1.deleteCharAt(str1.length()-2);
                    // Removing last extra comma
                    str1.append("}");
                    field.setText(str1.toString());
                    status.setText(" Added "+value+" to List");

                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Enter Only Integer to Add","Error",JOptionPane.WARNING_MESSAGE);
                    }
                }
                else{
                    //showing error option in case of invalid choice
                    JOptionPane.showMessageDialog(null,"Invalid Operation!\nSelect Queue for Add Operation","Error Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        //adding logic to delete button
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(queue.isSelected()){
                    int value=list.removeFirst();
                    //updating text field
                    StringBuffer str1=new StringBuffer();
                    str1.append("{  ");
                    for(int i=0;i< list.size();i++){
                        str1.append(list.get(i)+", ");
                    }
                    str1.deleteCharAt(str1.length()-2);
                    // Removing last extra comma
                    str1.append("}");
                    field.setText(str1.toString());

                    status.setText(" Deleted "+value+" from List");
                }
                else{
                    //showing error option in case of invalid choice
                    JOptionPane.showMessageDialog(null,"Invalid Operation!\nSelect Queue for Delete Operation","Error Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });


        //adding components to frame
        frame.add(field);
        frame.add(stack);
        frame.add(queue);
        frame.add(push);
        frame.add(add);
        frame.add(pop);
        frame.add(delete);
        frame.add(status);
        

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
