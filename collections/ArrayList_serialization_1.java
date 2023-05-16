package collections;

import java.util.*;
import java.io.*;

public class ArrayList_serialization_1 {

	public static void main(String[] args) {
		ArrayList<Integer> arr9=new ArrayList<Integer>();
			arr9.add(40);
			arr9.add(90);
			arr9.add(9);
			arr9.add(19);
			arr9.add(29);
			  try  
	          {  
	              //Serialization  
	              FileOutputStream fos=new FileOutputStream("file2");  
	              ObjectOutputStream oos=new ObjectOutputStream(fos);  
	              oos.writeObject(arr9);  
	              fos.close();  
	              oos.close();  
	              //Deserialization  
	              FileInputStream fis=new FileInputStream("file2");  
	              ObjectInputStream ois=new ObjectInputStream(fis);  
	            ArrayList  list=(ArrayList)ois.readObject();  
	            System.out.println(list);    
	          }catch(Exception e)  
	          {  
	              System.out.println(e);  
	          }  
	       }  	
		 
	
}
