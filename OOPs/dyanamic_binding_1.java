package oops;


class bike {
	void run() {
		System.out.println("Running bike");
	}
}

public class dyanamic_binding_1 extends bike{
	void run() {
		System.out.println("Running with splender");
	}
	public static void main(String[] args) {
		bike b=new bike();
		b.run();
	}
}
//The type can’t be determined by the compiler because the instance of main class is also
// an instance of Bike. So the compiler doesn’t know its type. That’s why the type is
// determined at runtime, so it’s dynamic binding.
//