package Assignments;

class data2{
	int v=0;
	boolean flag=false;
	
	public synchronized void set(int v) { 
		if(flag==true) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
		this.v=v;
		flag=true;
		notifyAll();
		
	}
	 public synchronized int get() {
		int x=0;
		if(flag==false) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
		x=v;
		flag=false;
		notifyAll();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
		return x;	
	}
}

class producer_2 extends Thread{
	data2 d;
	producer_2(data2 d){
		this.d=d;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			d.set(i);
			System.out.println("producer is producing : "+i);
			 try
             {
                   sleep((int)(Math.random() * 100));
             }
             catch (InterruptedException ie)
             {
                   ie.printStackTrace();
             }
		}
	}
}
class consumer_2 extends Thread{
	data2 d;
	consumer_2(data2 d){
		this.d=d;
	}
	public void run() {
		int i=1;
		for(i=1;i<=10;i++) {
			d.get();
			System.out.println("consumer is getting   : "+i);
			 try
             {
                   sleep((int)(Math.random() * 100));
             }
             catch (InterruptedException ie)
             {
                   ie.printStackTrace();
             }
		}
		
	}
}
public class thread_producer_consumer_probliem_2 {
	public static void main(String[] args) {
		data2 d=new data2();
		producer_2 p=new producer_2(d);
		consumer_2 c=new consumer_2(d);
		p.start();
		c.start();
		
	}
}
