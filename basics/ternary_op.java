public class ternary {
	public static void main(String[] args) {
	System.out.println((3>4)?"100":200);
    System.out.println((7>4)?"100":200);
	int b=1000;
	int sales=5000;
	int result= b+(sales>1000? 100:50);
	int res=(b+sales>1000)? 100:50;
	int res2=(b+sales)>1000? 100:50;
	System.out.println(result+" "+res+" "+res2) ;
	}
}