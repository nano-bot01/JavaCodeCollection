package programs;

class object1{
	 int sum(int a,int b) {
		int r=a+b;
		return r;
	}
}

public class class_method {

	public static void main(String[] args) {
		object1 obj=new object1();
		int r= obj.sum(47, 56);
		System.out.println("Sum is : "+r);
		
	}

}
