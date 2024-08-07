package DreamJava;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class SortingBubble 
{
	public static void main(String[] args) 
	{
		int ptr,temp;
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
	    	  for (int k = 0; k < n-i-1; k++) 
	    	  {
	    		  if(a[k]>a[k+1])
	    		  {
			     	temp=a[k];
			    	a[k]=a[k+1];
			    	a[k+1]=temp;
	    		  }
		      }
	      }
	      System.out.print("Sorted elements are ");
	      for (int i = 0; i < n; i++) 
	      {
			System.out.print(a[i]+" ");
		  }
	}

}
