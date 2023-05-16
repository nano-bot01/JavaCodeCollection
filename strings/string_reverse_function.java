package string;


public class string_reverse_function { 

	public static String reverse(String str) {
		if(str.isEmpty())
			return str;
	
		return reverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		String str="Ankit Nainwal";
		String rev=reverse(str);
		System.out.println("The reversed string is : " +rev);
	}
}
	
	
	
	
	