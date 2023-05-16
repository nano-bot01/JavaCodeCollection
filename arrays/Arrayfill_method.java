package Arrays;
	
import java.util.Arrays;

public class Arrayfill_method {
 
	 public static void main(String[] args) {
		int[] arr=new int[20];
		Arrays.fill(arr,5,10,9);
		Arrays.fill(arr,0,5,3);
		Arrays.fill(arr,10,16,6);
		Arrays.fill(arr,16,20,7);
		
		
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(arr));
	}
}
