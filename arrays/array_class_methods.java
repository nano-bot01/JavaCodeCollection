package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class array_class_methods {
	 public static void main(String[] args)   
     {   
		 int key=7;
		 int[] a= {65,34,23,97,53,92,68,24,86,44,100};
		 int [] n= {4,3,6,5,8,10,9,7,0,2,1};
		 String [] name= {"Ankit ","Nainwal","Au","Ram","Shyaam","Rahul","Krish"};
         Scanner s=new Scanner(System.in);
//   		 System.out.println("Enter the array");
//   		 for(int b=0;b<a.length;b++)
//   		 a[b]=s.nextInt();
         System.out.println("Integer Array as List: "+ Arrays.asList(n));
   		 Arrays.sort(n);
   		 Arrays.sort(name);
   		 System.out.print("Sorted names is ");
   		 for(int i=0;i<name.length;i++)
      		 System.out.print(" "+name[i]);
   		
   		 System.out.print("Sorted array is ");
   		 for(int i=0;i<n.length;i++)
      		 System.out.print(" "+n[i]);
   		System.out.println();
   		System.out.println(key + " found at index = "+ Arrays.binarySearch(n, key));
   		System.out.println("Integer Arrays on comparison: "+ Arrays.equals(a,n));
   		Arrays.sort(a);
   		System.out.println("Sorted array a :  ");
   		for(int i=0;i<n.length;i++)
     		 System.out.print(" "+a[i]);
   		System.out.println();
   		System.out.println("Integer Array as String "+ Arrays.toString(a));
  		
   		
}
}
