package adv_java_classwork;

import java.lang.reflect.*;
import java.util.Arrays;

class abc5{
	private int a;
	protected int b;
	public int c;
	int d;
	
	public abc5(){}
	public abc5(int a, int b, int c, int d) {}
	public abc5(String a, String b) {}
	
	public void print5() {
		System.out.println(a);
	}
	public int show5(int a, int b, int c) {
		this.a=a;
		this.b=b;
		System.out.println(" a is : "+a+ " and b is : "+ b);
		return b;
	}
}


public class reflection_package {
	public static void main(String[] args) throws NoSuchMethodException{
		Class<abc5> c=abc5.class;
		
		System.out.println("\n Using getname");
		System.out.println(c.getName()); 
		
		System.out.println("\n using getDeclaredFields");
		Field f[] = c.getDeclaredFields();
		for(Field x: f) {
			System.out.println(x);
		}
		
		System.out.println("\n using getMethods");
		Method m2[]= c.getMethods();
		
		
		for(Method x: m2) {
			System.out.println(x);}
		
		System.out.println("\n we are using getConstructor");
		try {
			Constructor	cc=  c.getConstructor();
			System.out.println(cc);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();}
		
		System.out.println("Printing constructor with 2 String Parameters: "+c.getConstructor(String.class, String.class));
		System.out.println("Printing constructor with 4 INT Parameters: "+c.getConstructor(int.class, int.class,int.class, int.class));
		
		System.out.println(c.getConstructors()); // returns the hashcode of constructor (default)
		
		System.out.println("\n we are using getParameters!");
		Parameter p[]= m2[0].getParameters();
		for(Parameter x:p) {
			System.out.println(x);
		}
		
		System.out.println("Number of methods in this class is "+m2.length);
		
		
}
}