package Exceptions;



public class exception_example {
	public static void main(String[] args) {
		try {
			String s="5.6";
			Integer.parseInt(s);
			int i=0;
			int y=2/i;
			
		}
		catch(RuntimeException e) {
			System.out.println("Runtime Exception");
		}
		catch(Exception ex) {
			System.out.println("Number formatException");
		}
		
	}
	
}
