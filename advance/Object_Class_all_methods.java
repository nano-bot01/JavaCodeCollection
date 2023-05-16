package adv_java_classwork;

class sum implements Cloneable{
	int a;
	int b;
	sum(int a,int b){
		this.a=a;
		this.b=b;
	}
	int add() {
		return a+b;
	}
}
public class Object_Class_all_methods extends sum{

	Object_Class_all_methods(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		sum s=new sum(5,8);
		System.out.println("the sum of "+s.a+" and "+s.b+" is "+s.add());
		sum s1=new sum(4,5);
		System.out.println(s.getClass().getName()+"@"+s.toString().hashCode());
		System.out.println(s.hashCode());
		System.out.println("equals= "+s.equals(s1));
		System.out.println(s.getClass());
		//sum s2=(sum)s.clone();
		
	}
	protected void finalize() {
		System.out.println("finalize method called");
	}
}
