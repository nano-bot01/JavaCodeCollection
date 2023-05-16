package Arrays;
import java.util.*;


public class array_sorting   {
	
     public static void main(String[] args)   
     {   
           int[] a=new int[10];
           Scanner s=new Scanner(System.in);
   			System.out.println("Enter the array");
   			for(int b=0;b<a.length;b++)
   			a[b]=s.nextInt();
   		
           System.out.println("Before sorting");   
           display(a);   
           sort(a);   
           System.out.println("\n After Sorting  :");   
           display(a);   
     }   
     static void display(int a[])   
     {   
        for(int i=0; i<a.length;i++)   
            System.out.print(a[i] + " ");   
     }   
     static void sort(int a[]) {
    	 int temp;
    	 for (int i=0;i<a.length-i;i++) {
    		 for (int j=0;j<a.length-i-1;j++) {
    		    	 if(a[j]>a[j+1])
    		    	 { 	temp=a[j];
    		    	 	a[j]=a[j+1];
    		    	 	a[j+1]=temp;
    		    	 }
    	 }
    	 }
     }
}
    	
     
     
