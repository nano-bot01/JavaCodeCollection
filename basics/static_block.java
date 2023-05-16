package programs;


public class static_block {

	static {
		System.out.println(" I am In Static block: ");// first come first serve
	}
	
	public static void main(String[] args) {
	System.out.println(" I am in Main ");
	}
	static {
		System.out.println(" I am second Static block: ");// more priority than psvm and less than first static
	}

}
