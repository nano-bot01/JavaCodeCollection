package string;

public class String_creation_methods_1 {

	public static void main(String[] args) {
		String str1 = "Java Program";// created in stack
		String str2 =new String("Ankit Nainwal");
		char c[]= {'A','n','k','i','t','N','a','i','n','w','a','l'};		
		String str3= new String (c);
		byte b[]= {43,23,45,3,11,85, 57,100};
		String str4=new String(b);
		String str5=new String(b,0,4);
		
		System.out.println("Str1= "+str1);
		System.out.println("Str2= "+str2);
		System.out.println("Str3= "+str3);
		System.out.println("Str4= "+str4);
		System.out.println("Str5= "+str5);
		String str6=new String(c,0,4);
		System.out.println("Str6= "+str6);
		
		String str7= "Java Program";
		System.out.println("Is str1 and str7 is same: "+(str1==str7));
		String str8 =new String("Java Program");// created in heap
		System.out.println("Is str1 and str8 is same: "+(str1==str8));
		
	}
}
