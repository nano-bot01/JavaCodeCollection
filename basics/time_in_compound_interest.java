import java.lang.Math;
public class compundinterest {
	public static void main(String[] args) {
	double pr=1000, am=1331,r=10, t;
	//we have to find t and t is 3 here
    t = Math.log(am/pr)+Math.log(1 + r);
	System.out.println("the value of time period is : "+t);
	}
}