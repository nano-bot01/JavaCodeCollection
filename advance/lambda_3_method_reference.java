package adv_java_classwork;

abstract interface abc4{
	public void display(String str) ;
}

abstract interface test4{
	public void reverse1(String s);
}

interface rever{
	  static void rev(String str1) {
		StringBuffer str3=new StringBuffer(str1);
		str3.reverse();
		System.out.println(str3);
	}
	//Static function for using direct method reference
}

public class lambda_3_method_reference {
	public static void main(String[] args) {
		abc4 a = (str)->{
			System.out.println("Ankit ");
			System.out.println("Nainwal");
		};
		a.display("ankit");
		//this doesn't run
		
		abc4 b=System.out::println;
		b.display("Ankit in b object");
		
		test4 t=(s)->{
			StringBuffer ss=new StringBuffer(s);
			ss.reverse();
			System.out.println(ss);
		};
		t.reverse1("Ankit Nainwal");
		// we just reversed a string using StringBuffer with a different 
		// interface and using lambda expression
		
//		rever rr=new rever();
//		rever r= r::rev("Wide Putin walk is awesome song");
//		
		rever.rev("Ankit Nainwal is the good coder!");
		
}}