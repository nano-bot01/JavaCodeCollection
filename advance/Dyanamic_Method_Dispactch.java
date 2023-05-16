package adv_java_classwork;

class Aa{
	public void show() {
		System.out.println("this is Aa class");
	}
}
class Bb extends Aa{
	public void show() {
		System.out.println("this is Bb class");
	}
	public void config() {
		System.out.println("config");
	}
}
class Cc extends Aa{
	public void show() {
		System.out.println("This is cc class");
	}
}
public class Dyanamic_Method_Dispactch {
	public static void main(String[] args) {
		Aa obj1= new Bb(); // Runtime Polymorphism
		/* The method we want to run using the help of reference of Aa class, 
		 * the method must be present in Aa class first for Runtime 
		Polimorphism*/
		obj1.show();
		obj1=new Cc();
		obj1.show(); //Dyanamic Method Dispatch
	}
}
