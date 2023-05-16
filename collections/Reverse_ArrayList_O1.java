package collections;
import java.util.*;


public class Reverse_ArrayList_O1 {
	public static void main(String[] args) {
		ArrayList <Integer> arr7=new ArrayList<Integer>();
		arr7.add(5);
		arr7.add(15);
		arr7.add(52);
		arr7.add(18);
		arr7.add(1);
		arr7.add(7);
		//Collection.sort(arr7);
		int temp, n=arr7.size();
		int i=0,j=n-1;
		for (int i1 = 0; i1 < arr7.size(); i1++) {
			System.out.print(arr7.get(i1)+ " ");
		}
		System.out.println();
		while(i<j) {
			temp=arr7.get(i);
			arr7.set(i, arr7.get(j));
			arr7.set(j, temp);
			i++;
			j--;
		}		
		arr7.forEach(e->{System.out.print(e+" ");});
		System.out.println();
		
		
	}
	}
	