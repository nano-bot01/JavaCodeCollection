package programs;
import java.math.BigDecimal;


public class big_decimal_example {
	public static void main(String[] args)
		{
			BigDecimal bd1 =new BigDecimal("124567890.0987654321");
			BigDecimal bd2 =new BigDecimal("987654321.123456789");
			
			bd1 = bd1.add(bd2);
			System.out.println("BigDecimal1 = " + bd1);

			bd1 = bd1.multiply(bd2);
			System.out.println("BigDecimal1 = " + bd1);
			
			bd1 = bd1.subtract(bd2);
			System.out.println("BigDecimal1 = " + bd1);
			
			bd1 = bd1.divide(bd2);
			System.out.println("BigDecimal1 = " + bd1);
			
			bd1 = bd1.pow(2);
			System.out.println("BigDecimal1 = " + bd1);

			bd1 = bd1.negate();
			System.out.println("BigDecimal1 = " + bd1);
		}	
	}		


