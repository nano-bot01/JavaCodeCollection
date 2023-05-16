package adv_java_classwork;
// Example of generics classes 

class Test<T, U>{
	T obj1;
	U obj2;
	 Test(T obj1, U obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	 public void print() {
		 System.out.println(obj1);
		 System.out.println(obj2);
	 }
}
public class Java_Generics_class_1 {
	public static void main(String[] args) {
		Test <String, Integer> obj3=new Test<String, Integer>("Ankit", 344);
		obj3=new Test<String, Integer>("boiiii",324);
		obj3.print();
	}
}
