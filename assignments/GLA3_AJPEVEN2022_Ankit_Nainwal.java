package Assignments;
//package Assignments;
//
//import java.util.concurrent.*;
//
///*
//Create a thread pool of 1000 threads. Name this thread pool as myPool. 
//Create an integer variable sum, and the purpose of each thread 
//in this pool will be to add 1 to this variable sum. Print the 
//final value of sum in the console. 
//
//*/
//
//class mypool implements Runnable{
//	int sum=0,n;
//	public mypool(int n) {
//		this.n=n;
//	}
//	public void run() {
//			{
//				sum+=n;
//				System.out.println(sum);
//				try {
//				Thread.sleep(10);
//			}
//			catch(InterruptedException ie) {
//				System.out.println(ie);
//		}	
//			}
//			
//	}
//}
//
//
//public class Graded_lab_3 {
//	public static void main(String[] args) {
//		int n=1;
//		for(int i=1;i<=1000;i++) {
//			ExecutorService exe=Executors.newFixedThreadPool(1000);
//			exe.execute(new mypool(n));
//			exe.shutdown();
//		}
//		System.out.println();
//	}
//	
//
//}
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class addder{
    int sum=0;
    synchronized void add(){
        this.sum+=1;
    }
}

public class GLA3_AJPEVEN2022_Ankit_Nainwal {
    public static void main(String[] args) {

        //creating thread pool of fixed size of 1000 threads
        ExecutorService myPool= Executors.newFixedThreadPool(1000);

        //creating object of adder class
        addder obj=new addder();

        //creating 1000 threads and executing them
        for(int i=0;i<1000;i++){
            myPool.execute(new Runnable() {
                @Override
                public void run() {
                    
                    obj.add();
                }
            });
        }

        //Shutting down the pool
        myPool.shutdown();
        //Showing the final value
        System.out.println("\nThe Final value of sum is-->"+obj.sum);
    }
}
