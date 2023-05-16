package adv_java_classwork;


class test2{
	private int i;
	test2(){
		
	}
	test2(int i){
		this.i=i;
	}
	public int getval() {
		return i;
	}
	public String toString() {
		return Integer.toString(i);
	}
}
public class wrapper_class_int {
	public static void main(String[] args) {
		test2 t=new test2(6);
		System.out.println(t.getval());
		System.out.println(t.getClass());
		System.out.println(t.toString());
	}
}
