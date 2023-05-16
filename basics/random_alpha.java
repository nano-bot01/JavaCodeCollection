// 1. Write a program that displays a random uppercase letter using the Math.random()
public class Exercise{
    public static void main(String[] args)
    {
   //Get a random integer from 0 - 26   
int randomNumber = (int)(Math.random() * 27);
  String alphabet = "abcdefghijklmnopqrstuvwxyz";
  // select a random character out of the alphabet and 
  // display print upper case
  System.out.println(" "+Character.toUpperCase(alphabet.charAt(randomNumber)));
    }    
}