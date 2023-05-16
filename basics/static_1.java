package programs;

public class static_1 {
	static double sum (int a,int b) {
		double r=a+b;
		return r;
	}
	//Using direct method
	public static void main(String[] args) {
		double res=static_1.sum(44,6);
		System.out.println("Sum is : "+res);
		//Using object
		static_1 obj=new static_1();
		double re= obj.sum(60,40);
		System.out.println("Sum is : "+re);
	}

}
