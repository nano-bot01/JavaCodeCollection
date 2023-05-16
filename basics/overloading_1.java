public class Main {
	int series (int x, char a){//increasing
	    for(int i=1;i<x;i++)
	    System.out.print(i+" ");
	    return x;
	}
	int series(char a, int x){
	    for(int i=x;i>=1;i--)//decresing
	    System.out.print(i+" ");
	    return 0;
	}
	public static void main(String[] args) {
		char a='a';
		Main obj=new Main();
		System.out.print(obj.series(a, 10) );//decresing
		System.out.print(obj.series(10,a));//increasing
	}
}