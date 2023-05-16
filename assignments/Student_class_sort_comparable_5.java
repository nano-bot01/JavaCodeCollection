package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student4{
	int age;
	String name;
	Student4(int age,String name){
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString(){
		return this.age+"--"+this.name;
	}
}


//sorting using comparator interface
class Sorter implements Comparator <Student4>{
	public int compare(Student4 o1, Student4 o2) {
		if(o1.age-o2.age==0){
			return o1.name.compareToIgnoreCase(o2.name);
		}
		else{
			return o1.age-o2.age;
		}
	}
}
public class Student_class_sort_comparable_5 {

	public static void main(String[] args) {
		ArrayList<Student4> sdList=new ArrayList<Student4>();

		//Adding ten Student objects to the list
		sdList.add(new Student4(21,"Ram"));
		sdList.add(new Student4(25,"Saurav"));
		sdList.add(new Student4(23,"Gaurav"));
		sdList.add(new Student4(22,"Rahul"));
		sdList.add(new Student4(21,"Shyam"));
		sdList.add(new Student4(23,"Abhishek"));
		sdList.add(new Student4(24,"Nikhil"));
		sdList.add(new Student4(25,"Himanshu"));
		sdList.add(new Student4(22,"Kartik"));
		sdList.add(new Student4(24,"Ritik"));

		System.out.println("List before Sorting----");
		System.out.println(sdList);

		//sorting the list
		Collections.sort(sdList,new Sorter());

		System.out.println("\nList after Sorting----");
		System.out.println(sdList);
	}
}


