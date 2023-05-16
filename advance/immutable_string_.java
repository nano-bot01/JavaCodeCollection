package adv_java_classwork;
import java.lang.*;

public class immutable_string_ {

	public static void main(String[] args) {
		String s=new String("seema");
		System.out.println(s);
		String s2=s;
		s.toUpperCase();
		System.out.println(s);
		s=s.toUpperCase();
		System.out.println(s);
		System.out.println("s2== "+s2+"\n\n"+"Mutable string -- ");
		StringBuffer s1=new StringBuffer("Meeta");
		System.out.println(s1);
		s1.append("sri");
		System.out.println(s1);
		System.out.println("the length of s1 is "+s1.length());
		System.out.println();
	}

}
















