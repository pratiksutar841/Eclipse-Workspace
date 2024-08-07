package DreamJava;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;
class quicksort
{
	int partition(int a[],int start, int end)
	{
		int pivot = a[end];
		int pindex=start;
		for(int i=start;i<end-1;i++)
		{
			if(a[i]<=pivot)
			{
				int t = a[pindex];
				a[pindex]=a[i];
				a[i]=t;
				pindex++;
			}
		}
		int t=a[pindex];
		a[pindex]=a[end];
		a[end]=t;
		return(pindex);
	}
	void quick1(int a[],int start,int end)
	{
		if(start <end)
		{
			int p = partition(a,start,end);
			quick1(a,start,p-1);
			quick1(a,p+1,end);
					
		}
	}
}
public class SortingQuick 
{
	
	public static void main(String[] args) 
	{
	int i,j,n,ptr,temp,loc;
	Scanner sc = new Scanner(System.in);
     System.out.print("How many elements do u want to enter = ");
       n = sc.nextInt();
      int a[]=new int[n];
      System.out.print("Enter the elements = ");
      for ( i = 0; i < n ;i++) 
      {
        	a[i]=sc.nextInt();
	  }
      quicksort q1 = new quicksort();
      q1.quick1(a,0,n-1);
	     
	      for (i = 0; i < n; i++) 
	      {
			System.out.print(a[i]+" ");
		  }
	}

}
