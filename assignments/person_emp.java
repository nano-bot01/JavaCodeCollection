package Assignments;

import java.time.LocalDate;

class person{
	String name="Ankit Nainwal";
	String address="234_Street";
	String phone_number="839439936";
	String email_address="JohnDoe47@gmail.com";
	
	void printData() {
		System.out.println("Name - "+this.name);
		System.out.println("Address - "+this.address);
		System.out.println("Phone_Number - "+this.phone_number);
		System.out.println("Email_Address - "+this.email_address);
	}
}
class Student extends person{
	final String status="freshmen";
	void printData() {
		super.printData();
		System.out.println("Status - "+status);
	}
}
class Employee1 extends person{
	String office="North Block 304";
	int salary=100000;
	LocalDate datehired=LocalDate.now();
	
	void printData() {
		System.out.println("Office - "+this.office);
		System.out.println("Salary - "+this.salary);
		System.out.println("Hired Date - "+this.datehired);
		}
}	
class Faculty extends Employee1{
	int office_hours=8;
	String rank="Database Administrator";	
	
	void printData() {
		super.printData();
		System.out.println("Office Hours - "+this.office_hours);
		System.out.println("Rank - "+this.rank);
	}
}
	
class Staff extends Employee1{
	String title="Manager";
	void printData() {
		super.printData();
		System.out.println("Title - "+this.title);
	}
}
public class person_emp {
	public static void main(String[] args) {
		//creating object of person class and printing its data
		person obj1=new person();
		System.out.println("\nData in person class is:---------");
		obj1.printData();
		//creating object of student class and printing its data
		Student obj2=new Student();
		System.out.println("\nData in student class is:--------");
		obj2.printData();
		//creating object of employee class and printing its data
		Employee1 obj3=new Employee1();
		System.out.println("\nData in employee class is:---------");
		obj3.printData();
		//creating object of staff class and printing its data
		Staff obj4=new Staff();
		System.out.println("\nData in staff class is:--------");
		obj4.printData();
		//creating object of faculty class and printing its data
		Faculty obj5=new Faculty();
		System.out.println("\nData in faculty class is:-----------");
		obj5.printData();
	}
	}