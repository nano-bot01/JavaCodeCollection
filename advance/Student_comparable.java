package adv_java_classwork;
import java.util.Arrays;

class Student3 implements Comparable<Student3 >{
	String name1;
	int age;
	public String getName1() {
		return name1;
	}
	public int getAge() {
		return age;
	}
	public void Student3 (String name1, int age) {
		this.name1 = name1;
		this.age=age;
	}
	public int compareTo(Student3  d) {
		int com;
		com=this.name1.compareTo(d.name1);
		if(com!=0)
			return com;
		else
			
		
		return 0;
	}
}
	
public class Student_comparable{
	public static void main(String[] args) {
		Student3  arr[]=new Student3[5];
	//	arr[0]=new Student3("ankit",19);
		
		String arr1[]=new String[5];
			arr1[0]="Tether";
			arr1[1]="Binance Coin";
			arr1[2]="Ethereum";
			arr1[3]="Bitcoin";
			arr1[4]="Dgecoin";
		
		
		
		System.out.println("Array befor sorting ");
		System.out.println("the array is : "+Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Arrays after sorting ");
		System.out.println("the array is : "+Arrays.toString(arr1));
	}
}


