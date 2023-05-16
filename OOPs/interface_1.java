package oops;

interface one{
	static void anku() {
		System.out.print("Ankit ");
	}
}
interface object extends one{
	
	static void nainwal() {
		System.out.println("Nainwal");
	}
	static void anku() {
		System.out.print("Ankit ");
	}
}
class ethree{
	void a() {
		System.out.println("I am method three");
	}
}
class three extends ethree implements object,one{
	void display() { 
		System.out.println(" My Name is: ");
		object.anku();
		object.nainwal();
	}	
}
class rock extends three{
	void name() {
		System.out.println("what is your name ?");
	
}
}

public class interface_1 {
	public static void main(String[] args) {
		rock r=new rock();
		r.name();
		r.display();
		r.a();
		
		
	}
}

