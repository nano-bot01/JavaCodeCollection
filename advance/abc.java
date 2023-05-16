package adv_java_classwork;

//
//class data2{
//	int v=0;
//	boolean flag=true;
//	synchronized void set(int v) { 
//		if(!flag) {
//			try {
//				wait();
//			}
//			catch(InterruptedException e) {
//				System.out.println(e);
//			}
//		}
//		this.v=v;
//		flag=false;
//		notify();
//	}
//	synchronized int get() {
//		int x=0;
//		if(flag) {
//			try {
//				wait();
//			}
//			catch(InterruptedException e) {
//				System.out.println(e);
//			}
//		}
//		x=v;
//		flag=true;
//		notify();
//		return x;	
//	}
//}
//
//class pro extends Thread{
//	data2 d;
//	pro(data2 d){
//		this.d=d;
//	}
//	public void run() {
//		int i=1;
//		while(true) {
//			d.set(i);
//			System.out.println("producer is producing : "+i);
//			i++;
//		}
//	}
//}
//class con extends Thread{
//	data2 d;
//	con(data2 d){
//		this.d=d;
//	}
//	public void run() {
//		int i=1;
//		while(true) {
//			int a=d.get();
//			System.out.println("consumer is getting : "+a);
//			i++;
//		}
//		
//	}
//}
public class abc {
	public static void main(String[] args) {
		Thread t = Thread.currentThread(); 
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		Thread.currentThread().setName("ankit");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
		 System.out.println(t); 
	}
}







//	public static void main(String[] args) {
//		data2 d=new data2();
//		pro p=new pro(d);
//		con c=new con(d);
//		p.start();
//		c.start();
//		
//	}
//}
//
