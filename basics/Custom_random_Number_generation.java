//import java.util.Random;
public class random {
	public static void main(String[] args) {
	 System.out.println("Math Random "+Math.random());
	 System.out.println("Math Random "+(int)(Math.random()*100));
	 System.out.println("Math Random "+Math.ceil((int)(Math.random()*100)));
	 /*Custom Random*/;
	 int max=20, min=5;
	 for(int i=0;i<20;i++) 
	 System.out.println("Custom Random : "+(int)(Math.random()*(max-min+1)+min)) ;
	}
}