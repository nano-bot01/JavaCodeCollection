package oops;

interface calculator
{
	int add(int a, int b);
	int multi(int a, int b);
}

class test implements calculator             // child class of interface calculator
{
	public int add(int a, int b)                                     // abstract method of interface
	{
		return(a+b);
	}
	public int multi(int a, int b)
	{
		return (a*b);
	}
	public int sub(int a, int b)
	{
		return (a-b);
	}
	public int div(int a, int b)
	{
		return (a/b);
	}
}


public class interface_calculator {
	public static void main(String[] args) {
		test t1=new test();
		System.out.println("Sum= "+t1.add(2,3));
		System.out.println("Multiply= "+t1.multi(2,3));
		System.out.println("Difference= "+t1.sub(2,3));
		System.out.println("Division= "+t1.div(2,3));
		

	}
	
}
