package oops;

interface std{
	abstract void define();
	void show();
}
interface std2{
	void imp();
}
class money1 implements std,std2{
	int rupee,paise;
	public void imp() {
		System.out.println("money is important! It is the thing for which people agree !!!");
	}
	void init(int a,int b) {
		rupee=a;
		paise=b;
	}
	public void define() { 
		rupee=100;
		paise=10;}
	public void show() {
		System.out.println("rupee "+rupee);
		System.out.println("paise "+paise);
	}
	public int getRupee() {
		return rupee;
	}
	public void setRupee(int rupee) {
		this.rupee = rupee;
	}
	public int getPaise() {
		return paise;
	}
	public void setPaise(int paise) {
		this.paise = paise;
	}
}
public class interface_2_money {
	public static void main(String[] args) {
		money1 m1=new money1();
		money1 m2=new money1();
		m1.imp();
		m1.init(200, 300);
		System.out.print("M1 = ");
		m1.show();
		m2.imp();
		System.out.print("M2 = ");
		m2.define();
		m2.show();
	}
}
