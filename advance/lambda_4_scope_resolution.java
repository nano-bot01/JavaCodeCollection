package adv_java_classwork;

interface lambda2{
	public void display(String s);
}
interface test5{
	public void display2(String a, String b);
}
public class lambda_4_scope_resolution {
	public lambda_4_scope_resolution(String s){
		System.out.println(s.toUpperCase());
	}
	public lambda_4_scope_resolution(String a, String b) {
		System.out.println("the result of compareTo method to "+a+" and "+b+ " is "+a.compareTo(b));
	}
	public static void main(String[] args) {
		lambda2 l= lambda_4_scope_resolution::new;
		l.display("Ankit nainwal is listening to Gangsta Paradise:");
		
		test5 t= lambda_4_scope_resolution::new;
		t.display2("Ankit Nainwal", "Ankit Mainwal");
	}
} 
