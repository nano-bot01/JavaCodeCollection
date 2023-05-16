package adv_java_classwork;

interface abc3{
	public void display(String str) ;
	}

interface sum3{
	public int sum(int a,int b);
}
interface diff{
	public void dif(int a, int b);
}
public class lambda_2_parameters {
	public static void main(String[] args) {
		abc3 a=(str)->{
			System.out.println(str);
		};
		a.display("tiknA_lawniaN");
		
		sum3 s1=(x,y)->{ return x + y;
		};
		System.out.println("The SUM is: "+s1.sum(4,5));
		
		
		diff d=(x,y)-> System.out.println("The difference of "+x+" and "+y+" is: "+Math.abs(x-y)); 
		d.dif(66, 40);
	}
}
