package Arrays;

class variable_argument {
	static void fun(int... a)
	{
		System.out.println("Number of arguments: "
						+ a.length);

		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		fun(100);
		fun(1, 2, 3, 4);
		fun();
		fun(2,4,5,4,6,4,6,7,8,8,99);
	}
}


