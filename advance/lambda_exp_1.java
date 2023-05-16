package adv_java_classwork;

@FunctionalInterface

@SuppressWarnings("deprecation")
interface lambda1{
	@Deprecated
	public void display();
	
}
class test22 implements lambda1{
	@Override
	public void display() {
		System.out.println("hello how are you, I am fine!");
	}
	
}

public class lambda_exp_1 {
	public static void main(String[] args) {
		System.out.println("\nMethod One for printing");
		test22 a=new test22();
		a.display();
		
		System.out.println("\nMethod Two for printing");
		lambda1 b=new test22();
		b.display();
		
		System.out.println("\nMethod Three for printing");
		lambda1 c=new lambda1() {
			public void display() {
				System.out.println("Hello how are you, I am fine! in lambda");
			}
		};
		c.display();
		
		System.out.println("\nMethod Four for printing: using Lambda expression: ");
		lambda1 d= () ->{
			System.out.println("Hello how are you, I am fine! in lambda");
		};
		d.display();
		
	}
}
