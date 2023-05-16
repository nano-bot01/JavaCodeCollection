public class Main {
	public static void main(String[] args) {
	System.out.println(Math.rint(14.4)) ;
  System.out.println(Math.round(14.4)) ;
  // rint -> gives float , round gives int
	System.out.println(Math.abs(Math.ceil(-6.35))) ;
	System.out.println(Math.abs(Math.min(-2.83, -5.83)));	
System.out.println(Math.sqrt(Math.floor(16.3))) ;

double r1 = Math.abs(Math.min(-2.83, -5.83));
double r2 = Math.sqrt(Math.floor(16.3));
System.out.println("ans "+r1+"   "+r2);

System.out.println(Math.pow(47.5,6.3));

double x=2.9, y=2.5;
System.out.println(Math.min(Math.floor(x), y));
System.out.println(Math.max(Math.ceil(x), y));
System.out.println(Math.abs(-999));
System.out.println(Math.cbrt(-3375));
System.out.println(Math.sqrt(-2));
System.out.println(Math.rint(999.99));
System.out.println(Math.round(999.99));
			}
	
}