package programs;

class static1{
	static int sum(int a,int b) {
		int r=a+b;
		return r;
	}
}

public class static_method {

	public static void main(String[] args) {
		double add= static1.sum(56,34);
		System.out.println("Sum is : "+add);
		
	}

}
