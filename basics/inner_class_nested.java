package programs;

class outer{
	int x=10;
	class inner{
		int y=20;
		void inner_display(){
			x=15;
			System.out.println("Inner\nthe value of x= "+x+"\nthe value of y= "+y);
		}
	}
	void outer_display() {
		System.out.println("Outer\nthe value of x= "+x);
		inner i=new inner();
		i.inner_display();
		
	}
	void change() {
		x=50;
		System.out.println("x is changed now");
	}
}
public class inner_class_nested {
	public static void main(String[] args) {
		outer o=new outer();
		o.outer_display();
		o.change();
		outer.inner i=new outer().new inner();
		o.outer_display();
		System.out.println("\nInner accessed through object");
		i.inner_display();
	}
}
