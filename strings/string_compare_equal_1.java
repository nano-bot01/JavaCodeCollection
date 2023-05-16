package string;

import java.lang.String;
public class string_compare_equal_1 {
	public static void main(String[] args) {
		
	
	
	String str1=new String("Ankit");
	String str2=new String("Ankit");
	String str3="Ankit";
	String str4="Ankit";
	
	System.out.println(str1.hashCode());
	System.out.println(str3.hashCode());
	System.out.println(str4==str3);

	System.out.println("isequal str1 and str2 : "+str1.equals(str1));
	System.out.println("compareto str1 and str2 "+str1.compareTo(str2));
	System.out.println("== str and str2 "+(str1==str2));
	System.out.println("isequal str1 and str2 : "+str1.equals(str1));
	System.out.println("compareto str1 and str2 "+str1.compareTo(str2));
	System.out.println("== str4 and str2 "+(str4==str3));
}
}