import java.util.*;

public class JobSequencing {
	static void sortProfit(int p[],int d[],int job[]){
		int n=p.length;
		 for (int i = 0; i < n - 1; i++)
		    {
		        for (int j = 1; j < n - 1 - i; j++)
		        {
		            if (p[j + 1] > p[j])
		            {
		                int temp = p[j + 1];
		                p[j + 1] = p[j];
		                p[j] = temp;

		                int temp2 = d[j + 1];
		                d[j + 1] = d[j];
		                d[j] = temp2;
		                
		                int temp3 = job[j + 1];
		                job[j + 1] = job[j];
		                job[j] = temp2;
		            }
		        }
		    }
	}

public static void main(String args[]){
	int profit[] = {20,15,10,5,1};
	int deadline[] = {2,2,1,3,3};
	int job[] = {1,2,3,4,5};
	int n=profit.length;
    sortProfit(profit,deadline,job);
    int jobSlot[]= new int[n];
    for(int i:jobSlot)
    	i=0;
    int emptySlots=n;
    int i=0;
    while(i<n&&emptySlots>0){
        
    	for(int j=Math.min(n,deadline[i]-1);j>=0;j--) 
    		if(jobSlot[j]==0) {
    			jobSlot[j]=job[i];
    			emptySlots++;
    			break;
    		}
    		i++;
    			
    }

    	for(int k :jobSlot) {
    		if(k!=0)
    		System.out.print(k+", ");
    	}
}
}