package Arrays;
import java.util.Random;
public class array_max_in_random {

	public static void main(String[] args) {
		
		double[] val=new double[10];
		
		double max;
		double min;
		System.out.println("Random array is: ");
		for(int i=0;i<val.length;i++)
		{
			val[i]=new Random().nextInt(100);
			System.out.print(" "+val[i]);
		
		}
		max=val[0];
		min=val[0];
		
		for(int i=0;i<val.length;i++) {
			if(val[i]<min)
				 min = val[i];
	        if (val[i] > max)
	            max = val[i];
	      }
		System.out.println();
	      System.out.println("Minimum element = " + min);
	      System.out.println("Maximum element = " + max);
				
				
		}
		
	}

