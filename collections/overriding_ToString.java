package collections;

class Student{
	String name;
	int age;
	public String ToString() {
		return "Name : "+name+" \nage: "+age;
	}
}

public class overriding_ToString{
	public static void main(String[] args) {
		Student s=new Student(); 
		s.name="Ankit";
		s.age=20;
		System.out.println(s.ToString());
		System.out.println(s);
	}
}
