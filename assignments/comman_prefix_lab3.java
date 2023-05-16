package Assignments;
import javax.swing.*;

public class comman_prefix_lab3 {
	void commanpre(String s1,String s2){
	       String str="";
	        int min_length = Math.min(s1.length(),s2.length());
	        
	        for(int i=0;i<min_length;i++){
	          if(s1.charAt(i) != s2.charAt(i)){
	             str = s1.substring(0,i);
	             break;
	          }
	        } 
	        if(str.length()!=0){
	          JOptionPane.showMessageDialog(null,"comman prefix:"+str);
	        }
	        else if(str.length()==0){
		          JOptionPane.showMessageDialog(null,"no comman prefix !");
		        }
		    }
		    
		    public static void main(String args[]){
		        String str1 = JOptionPane.showInputDialog("Enter first string:");
		        String str2 = JOptionPane.showInputDialog("Enter second string:");
		        comman_prefix_lab3 cf= new comman_prefix_lab3();
		        cf.commanpre(str1,str2);
		   
		   }sadfa
	}
