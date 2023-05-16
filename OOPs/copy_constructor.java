package oops;



public class copy_constructor {
	int id;
	String name;
	
	copy_constructor(){
		this.id=id;
	}
	
	copy_constructor(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	copy_constructor(copy_constructor copy){
		this.id=copy.id;
		this.name=copy.name;
	}
	
	void display() {
		System.out.println("ID: "+this.id+"  Name: "+this.name);
	}
	public static void main(String[] args) {
		copy_constructor copy= new copy_constructor(44,"Ankit");
		copy.display();
		
		copy_constructor copied =new copy_constructor(copy);
		copied.display();
	}
}
