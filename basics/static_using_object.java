package programs;


public class static_using_object {

	static int i=50;
	int j=100;
	static void access() {
		System.out.println("i= : "+i);
	}
	
	public static void main(String[] args) {
	static_using_object.access();
	access();
	static_using_object ob=new static_using_object();
	ob.access();
	System.out.println(ob.i);
	System.out.println(ob.j);
	}

}
