package collections;
import java.util.*;
import java.util.Iterator;


class Student_data{
	int roll;
	String name;
	int age;
	String branch;
	public Student_data(int roll, String name, int age, String branch){
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.branch=branch;
	}
}
public class User_defined_Class_in_ArrayList{
	
	public static void main(String[] args) {
		Student_data s01=new Student_data(1,"Ankit",20,"CSE");
		Student_data s02=new Student_data(2,"Amit",23,"IT");
		Student_data s03=new Student_data(3,"Anuj",26,"ML");
		Student_data s04=new Student_data(4,"Sohan",30,"IT");
		Student_data s05=new Student_data(5,"Girish",30,"CS");
		Student_data s06=new Student_data(6,"lassan",20,"IT");
		Student_data s07=new Student_data(7,"pyaaz",10,"ML");
		
		ArrayList <Student_data> arr8=new ArrayList<Student_data>();
		arr8.add(s01);
		arr8.add(s02);
		arr8.add(s03);
		arr8.add(s04);
		arr8.add(s05);
		arr8.add(s06);
		arr8.add(s07);
		
		Iterator<Student_data> itr2=arr8.iterator();
		while(itr2.hasNext()) {
			Student_data s=(Student_data)itr2.next();
			System.out.println(s.roll+" "+s.name+" "+s.age+" "+s.branch);
	
	}
		
		
	}
}
