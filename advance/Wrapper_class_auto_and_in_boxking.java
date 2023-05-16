package adv_java_classwork;

import java.util.ArrayList;

public class Wrapper_class_auto_and_in_boxking {
	public static void main(String[] args) {

		char ch='a';
		Character a=ch;
		// this was autoboxing primitive to char object conversion
		ArrayList<Integer> ar3=new ArrayList<Integer>();
		// Autoboxing because ArrayList stores only objects
		ar3.add(35);
		System.out.println(ar3.get(0));
		
		//now unboxing
		Character ch1 = 'a';
	    char a1 = ch;
	    ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(24);
  
        // unboxing because get method returns an Integer object
        int num = arrayList.get(0);
  
        // printing the values from primitive data types
        System.out.println(num);
	}
}
