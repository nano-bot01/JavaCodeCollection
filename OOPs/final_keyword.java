package oops;


class Animal {

String name;
  public void eat() {
    System.out.println("I can eat");
  }
}

final class Dog extends Animal {//can't make further class by this class as base
	public void eat() {
		System.out.println("I can drink water");
	}
	public void display() {
    System.out.println("My name is " + name);
  }
}

public class final_keyword {
  public static void main(String[] args) {

    Dog labrador = new Dog();

    labrador.name = "AMBAR";
    labrador.display();

    labrador.eat();

  }
}