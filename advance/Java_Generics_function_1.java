package adv_java_classwork;
// Example of generics functions

public class Java_Generics_function_1 {

	static <MT> void genericsfun1(MT element) {
		System.out.println(" "+ element.getClass()+" "+ element);
		System.out.println("the object has "+ element.getClass().getName()+" = "+element);
		System.out.println("type = "+element.getClass().getSimpleName()+"\n");
		
		
	}
	public static void main(String[] args) {
		genericsfun1("Ankit");
		genericsfun1(89);
		genericsfun1(34.223);
		
	}
}
