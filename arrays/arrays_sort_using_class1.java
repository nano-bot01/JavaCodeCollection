package Arrays;
import java.util.Arrays;

public class arrays_sort_using_class1 {
	public static void main(String[] args) {
		String arr1[]=new String[5];
		arr1[0]="Tether";
		arr1[1]="Binance Coin";
		arr1[2]="Ethereum";
		arr1[3]="Bitcoin";
		arr1[4]="Dgecoin";
		
		
		
		System.out.println("Array befor sorting ");
		System.out.println("the array is : "+Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Arrays after sorting ");
		System.out.println("the array is : "+Arrays.toString(arr1));
	
	}
}
