package collections;

import java.util.*;

import java.util.*;  
public class Collections_1 {  
    public static void main(String a[]){         
        List<Integer> list = new ArrayList<Integer>();  
        list.add(46);  
        list.add(67);  
        list.add(24);  
        list.add(16);  
        list.add(8);  
        list.add(12);  
        System.out.println("minimum value: "+Collections.min(list));  
        System.out.println("maximum value: "+Collections.max(list));  
        System.out.println("Reverse sort");  
        System.out.println(list);        
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("Shuffled List: "+list);
    }  
}  
