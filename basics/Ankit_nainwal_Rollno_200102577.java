import java.util.*;
public class Main {
	public static void main(String[] args) {
	System.out.println(" Ankit Nainwal \n Sap- 1000014497");
	System.out.print(" Enter an Alphabet to check:  ");
	Scanner s=new Scanner(System.in);
    char ch=s.next().charAt(0);
    ch=Character.toLowerCase(ch);
    String st;	st=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?" Vowel":" Consonant";
        System.out.println(st);
	
	
	}
}