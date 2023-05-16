import java.util.*;
class student
{
    int rollno;
    String Name;
    int marks1;
    int marks2;
    int marks3;
    
    void input(int r,String n, int m1, int m2, int m3){
        rollno =r;
        Name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }
    void display(){
        System.out.println("rollno="+rollno);
        System.out.println("Name="+Name);
        int percentage = (marks1+marks2+marks3)/3;
        System.out.println("Percentage="+percentage);
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
      System.out.println("Ankit Nainwal 100014497");
        student s = new student();
        System.out.println("Enter the rollno of the student");
        int r= sc.nextInt();
        System.out.println("Enter the Name of the student");
        String n= sc.next();
        System.out.println("Enter the Marks of three Subject of the student");
        int mk1 = sc.nextInt();
        int mk2 = sc.nextInt();
        int mk3 = sc.nextInt();
        s.input(r,n,mk1,mk2,mk3);
        
        s.display();
    }
}