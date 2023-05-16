package adv_java_classwork;

class hondacity{
	static long price=1000000;
	int a, b;
	hondacity(int a, int b){
		this.a=a;
		this.b=b;
	}
	static double pricem(String city) {
		switch(city) {
		case "delhi":
			return price+price*.15;
		case "goa":
			return price+price*0.1;
		default:
			return price+price*0.25;
		}
		
	}
}


public class Static_keyword_method_1 {
	public static void main(String[] args) {
		hondacity h1=new hondacity(20,30);
		hondacity h2=new hondacity(25,60);
		System.out.println("the initial price in h1 is "+hondacity.price);
		System.out.println("the initial price in h2 is "+hondacity.price);
		System.out.println("the value of a and b in h1 is "+h1.a+" "+h1.b);
		System.out.println("the value of a and b in h2 is "+h2.a+" "+h2.b);
		System.out.println("the price of hondacity in goa is : "+hondacity.pricem("goa"));
		System.out.println("the price of hondacity in delhi is : "+hondacity.pricem("delhi"));
		System.out.println("the price of hondacity in other places is : "+hondacity.pricem("ankit"));
		
		
	}
}
