package DreamJava;

import java.util.Scanner;

public class SearchLinear 
{
	public static void main(String[] args) 
	{
		int i ,c = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("How many elements do u want to enter = ");
      int n = sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the elements  ");
      for ( i = 0; i < n ;i++) 
      {
		a[i]=sc.nextInt();
	  }
      System.out.println("Enter item to find ");
      int item = sc.nextInt();
      for ( i = 0; i < a.length; i++) 
      {
    	  if(a[i]==item)
    	  {
    		  c++;
    		  break;
    	  }
      }
		if(c>0) 
		{
			System.out.println("item exist at "+i);
		}
		else
		{
			System.out.println("item does not exist");
		}
			
	
      
	}

}
