package string;

public class string_class {

	public static void main(String[] args) {
		String s= "Ankit Nainwal";
		System.out.println("String length = " + s.length());
  
        System.out.println("Character at 3rd position "+ s.charAt(3));
        System.out.println("Substring " + s.substring(3));
  
        System.out.println("Substring  = " + s.substring(2,5));
        String s1 = "yeah ";
        String s2 = " Boii";
        System.out.println("Concatenated string  = " +s1.concat(s2));
  
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + s4.indexOf("Share"));
        System.out.println("Last Tndex of a "+s4.lastIndexOf("a"));
        System.out.println("Index of a  = " +  s4.indexOf('a',3));
        Boolean out = "Ankit".equals("ankit");
        System.out.println("Checking Equality  " + out);
        out = "Ankit".equals("ankit");
        System.out.println("Checking Equality  " + out);
  
        out = "ANKIT".equalsIgnoreCase("ankit ");
        System.out.println("Checking Equality " + out);
          
        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "Ankume";
        System.out.println("Changing to lower Case " +
                            word1.toLowerCase());
  
        // Converting cases
        String word2 = "naINwal";
        System.out.println("Changing to UPPER Case " + word2.toUpperCase());
  
        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());
  
        // Replacing characters
        String str1 = "anku_nainwal";
        System.out.println("Original String " + str1);
        String str2 = "ankitnainwal".replace('a' ,'m') ;
        System.out.println("Replaced a with m -> " + str2);
    }} 

