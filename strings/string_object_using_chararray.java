package string;
import java.util.Scanner;
public class string_object_using_chararray {

	
	public static void main(String[] args) {
		char[] arr=new char[] {'1','2','3','4','5','6',};
		String s=String.copyValueOf(arr,2,3);
		System.out.println(s);

		
	}
}
