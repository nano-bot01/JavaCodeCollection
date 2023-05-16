package programs;

class ToPrint{
	public void show()
	{
		System.out.println("Hyee I am in show method in ToPrint class");
	}
}

public class Anonymous_class_1 {
	public static void main(String[] args) {
		ToPrint obj=new ToPrint() {
			public void show() {
				System.out.println("Hyee I am in Anonymous Class in main class");				
			}
		};
		obj.show();
	}
}
