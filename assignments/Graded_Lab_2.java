package Assignments;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.*;

public class Graded_Lab_2 {
	static int max=100;
	static int min=0;
	public static void main(String[] args) {
		ArrayList <Integer>arr=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			arr.add((int) (Math.random()*(max-min+1)+min));
		}
		// The elements are added
		System.out.println("The elements Inserted are : \n\t"+arr);
		Collections.sort(arr);
		System.out.println("Sorted list of number: \n\t"+arr);
		TreeSet<Integer> tree = new TreeSet<Integer>(arr);
		System.out.println("Sorted list of number after Removing Duplicates: \n\t"+tree);
	}
}

//   
//        int number;
//        Random rand = new Random();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for(int i = 0; i < 10; i++){
//            number = rand.nextInt(100);
//            list.add(i, number);
//
//        }
//        System.out.println("Orignal list of number: "+list);
//        Collections.sort(list);
//        System.out.println("Sorted list of number: "+list);
//       
//        TreeSet tree = new TreeSet<>(list);
//        System.out.println("Sorted list of number after emoving duplicates: "+tree);
//
//    }
//
//}