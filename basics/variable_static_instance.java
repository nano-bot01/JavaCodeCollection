package programs;

public class variable_static_instance {


int myVariable;
	   static int data = 30;
	   
	   public static void main(String args[]){
		   variable_static_instance obj = new variable_static_instance();
	      
	      System.out.println("Value of instance variable: "+obj.myVariable);
	      System.out.println("Value of static variable: "+variable_static_instance.data);
	   }
	}
