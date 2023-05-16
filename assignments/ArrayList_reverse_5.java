package Assignments;
import java.util.ArrayList;

public class ArrayList_reverse_5 {
    public static void main(String[] args) {

        //creating an array list
        ArrayList<Integer> arrList=new ArrayList<Integer>();

        //adding first ten natural numbers to the list
        for(int i=0;i<10;i++){
            arrList.add(i+1);
        }
        System.out.println(" Array List Without Reversing----");
        System.out.println(" "+arrList);

        //reversing the array list
        int n=arrList.size();
        for(int i=0;i<n/2;i++){
            int temp=arrList.get(i);
            arrList.set(i,arrList.get(n-1-i));
            arrList.set(n-1-i,temp);
        }

        System.out.println("\n Array List After Reversing----");
        System.out.println(" "+arrList);
    }
}


