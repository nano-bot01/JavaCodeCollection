package Exceptions;


public class exception_handling_3 {
	 public static void main(String[] args)
	{
		int a[]=new int[2];
			System.out.println("initialize");
		try
		{
			System.out.println(a[3]);
		}catch(Exception e)
		{
			System.out.println("array index");
		}
		finally
		{
			System.out.println("close ");
		}
}
}