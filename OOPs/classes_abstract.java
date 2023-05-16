package oops;


abstract class base {
	public base() {
		System.out.println("I am base class: ");
	}
	
	public void fun1() {
		System.out.println("I am fun 1 : ");
	}


abstract public void greet();
}

class child extends base{
	public child () {
		System.out.println("\"I am constructor of child class\"");
	}
	public void greet() {
		System.out.println(" I am greet !: ");
	}
	
}

public class classes_abstract {

 	public static void main(String[] args) {
 		base b = new child();
		b.fun1();
 		child c = new child();
		c.greet();
		
	}

}
