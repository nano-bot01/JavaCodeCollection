package Exceptions;

class account{
	
	int balance(int b, int w) throws accountExcption{
		if(b-w<0)
			throw new accountExcption();
		int am=b-w;
		return am;
}
}
public class accountExcption  extends Exception{
	public String toString() {
		return "This is below of minimum balance limit";
	}
	public static void main(String[] args) {
		account a1=new account();
		try {
			int x= a1.balance(1, 6);
			System.out.println(x);
		} catch (accountExcption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}

