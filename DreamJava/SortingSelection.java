package DreamJava;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class SortingSelection 
{
	public static void main(String[] args) 
	{
	int ptr,temp,loc;
	Scanner sc = new Scanner(System.in);
     System.out.print("How many elements do u want to enter = ");
      int n = sc.nextInt();
      int a[]=new int[n];
      System.out.print("Enter the elements = ");
      for ( int i = 0; i < n ;i++) 
      {
        	a[i]=sc.nextInt();
	  }
	      for (int i = 0; i < n-1; i++) 
	      {
	    	  loc=i;
	    	  for (int j = i+1; j < n; j++) 
	    	  {
	    		 
	    		  if(a[j]<a[loc])
	    		  {
			     	loc=j;
	    		  }
		      }
	    	  temp=a[i];
	    	  a[i]=a[loc];
	    	  a[loc]=temp;
	      }
	      System.out.print("Sorted elements are ");
	      for (int i = 0; i < n; i++) 
	      {
			System.out.print(a[i]+" ");
		  }
	}

}
