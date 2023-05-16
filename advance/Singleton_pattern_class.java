package adv_java_classwork;

class a{
	private static a obj;
	private a() {
		
	}
	public static a geta() {
		return obj;
	}
}

public class Singleton_pattern_class {
	public static void main(String[] args) {
		System.out.println("this is example of singleton class in java");
	}
}
