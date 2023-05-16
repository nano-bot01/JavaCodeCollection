import java.util.*;
public class time_converter  {
	public static void main(String[] args) {
   Scanner str = new Scanner(System.in);
  System.out.print("Enter the Choice :\n1. Minute to Second:\n2. Second to Minute:  ");
  int ch=str.nextInt();
  if(ch==1){
    System.out.print("Enter the time in Seconds: ");
   int sec=str.nextInt();
   int min1=sec%60;
   int min=sec/60;
   System.out.println("The Time period in minutes is : "+min+" Minutes "+min1+" Seconds");}
   else if(ch==2){
      System.out.print("Enter the time in Minutes: ");
   int min=str.nextInt();
   int sec=min*60;
   System.out.println("The Time period in seconds is : "+sec+" Seconds");}
   else System.out.println("Invalid Input :( ");
  
	}
}