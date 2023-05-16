package Exceptions;

class myexc extends Exception{
	public String tostr() {
		return "no is < than 5";
	}
}
public class exception_handling_user_defined {

	static void compare(int x)throws myexc{
		if(x>10)
			throw new myexc();
		else 
			System.out.println("x= "+x);
	}
	
	public static void main(String[] args) {
		try {
			compare(11);
		}
		catch(myexc e) {
			System.out.println(e);
		}
	}
	
	
}
