package oops;

class Area{
	int l, b;
	public Area(int i, int j) {
		this.l=i;
		this.b=j;
	}
	int area(int l, int b) throws Negative_Dimension_Exception {
		if(l<0||b<0)
			throw new Negative_Dimension_Exception();
		 return l*b;
	}
	
}
public class Negative_Dimension_Exception  extends Exception{
	 public String toString() {
		 return "the demension must be positive!";
	 }
	 public static void main(String[] args) {
		 try {
			Area aa=new Area(4,5);
			System.out.println(aa.area(-4, 4));
		 }
		 catch(Negative_Dimension_Exception e){
			 System.out.println(e);
			 System.out.println(e.getStackTrace());
			 System.out.println(e.getMessage());
		 }
		 
	}
	 
}
