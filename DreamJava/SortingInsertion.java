package DreamJava;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class SortingInsertion 
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
	      for (i = 1; i <=n-1; i++) 
	      {
	    	 
	    	  temp=a[i];
	    	  j=i-1;
	    	  while(temp<a[j]&&j>-1)
	    	  {
	    		  a[j+1]=a[j];
	    		  j=j-1;
	    	  }
	    	  a[j+1]=temp;
	      }
	      System.out.print("Sorted elements are ");
	      for (i = 0; i < n; i++) 
	      {
			System.out.print(a[i]+" ");
		  }
	}

}
