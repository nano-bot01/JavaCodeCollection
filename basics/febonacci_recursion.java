public class Main {
	static int feb(int n)
	{if(n==0||n<2)
	return n;
	else
    return feb(n-1)+feb(n-2);
	}

public static void main(String[] args){
  for(int i=0;i<=10 ;i++)
	System.out.print(feb(i)+" ");
	}
}