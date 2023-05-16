package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Sum_Number_5 {
	public static void main(String[] args) {
		//creating an array list
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		//adding first ten natural numbers to the list
		for(int i=0;i<10;i++){
			arrList.add(i+1);
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number for whose sum you want to check:-");
		int n=sc.nextInt();
		// boolean to find the pairs of number exist in list or not
		boolean found=false;

		for(int i=0;i<arrList.size();i++){
			for(int j=i+1;j<arrList.size();j++){
				if(arrList.get(i)+arrList.get(j)==n){
					System.out.println(arrList.get(i)+"+"+arrList.get(j)+"="+n);
					System.out.println();
					found=true;
				}
			}
		}

		//if no elements found then printing message
		if(!found){
			System.out.println("No elements found in list whose sum is equal to "+n);
		}
	}
}