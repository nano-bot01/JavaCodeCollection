package Arrays;
import java.util.*;

class object_arr
{
	int rollno;
	String name;
	
void input(int r, String n)
{
	rollno=r;
	name=n;
}

void display()
{
	System.out.println(rollno + "  "+name);
}
}

public class array_of_object {
	public static void main(String[] args) {
		
	Scanner in=new Scanner(System.in);
	System.out.print(" Enter records of 3 students :");
	object_arr[] o1=new object_arr[3];
	int i;
	for(i=0;i<3;i++)
	{
		o1[i]=new object_arr();
	}
	for(i=0;i<3;i++)
	{
		int r;
		String n;
		System.out.println(" Enter Rollno and Name of students number :"+(i+1));
		r=in.nextInt();
		n=in.next();
		o1[i].input(r,n);
	}
	System.out.println(" 3 Records are :");
	for(i=0;i<3;i++)
	{
		o1[i].display();
	}
}
}
