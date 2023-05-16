package Arrays;
public class array_duplicate_1 {

	public static void main(String[] args) {
		int count =0;
		int [] arr= {4,5,6,7,7,3,2,1,4,9,8,0,6};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if((arr[i])==arr[j]&&(i!=j)&&(i!=j+1)) {
					count++;
					System.out.println("Duplicate Element : "+arr[i]);
				}
			}
		}
		System.out.println("Total "+count+" Duplicate Elements present");
		
	}
}
