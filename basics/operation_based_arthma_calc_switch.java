import java. util. *;
public class Main {
	public static void main(String[] args) {
	//program for using operators in switch 
int a= 5,b=4;
System.out.println("Enter one operation  (+,-,*,/,% :");
Scanner c=new Scanner(System.in);
char ch=c.next().charAt(0);
switch (ch)
{ case '+': {System.out.println("Sum of a and b is "+(a+b)); break;}
case '-': {System.out.println("Difference of a and b is "+(a-b)); break;}
case '*': {System.out.println("product of a and b is "+a*b); break;}
case '/': {System.out.println("division of a and b is "+a/b); break;}
case '%': {System.out.println("Modulus of a and b is "+a%b); break;}
default: System.out.println(" Wrong Input ❌");

    }

	}
}