package DreamJava;
import java.util.Scanner;
public class SearchBinary 
{

	public static void main(String[] args) 
	{
		
		int i ,beg = 0,end = 0,mid=0,c = 0;
	     Scanner sc = new Scanner(System.in);
	     System.out.print("How many elements do u want to enter = ");
	      int n = sc.nextInt();
	      int a[]=new int[n];
	      System.out.print("Enter the elements = ");
	      for ( i = 0; i < n ;i++) 
	      {
			a[i]=sc.nextInt();
		  }
	      System.out.print("Enter item to find = ");
	      int item = sc.nextInt();
	      end=n-1;
	      while(beg<=end)
	      {
	    	  mid=(beg+end)/2;
	    	  if(item==a[mid])
	    	  {
	    		  //System.out.println("Item found at "+mid);
	    		  c++;
	    		  break;
	    	  }
	    	  else if(item>a[mid])
	    	  {
	    		  beg=mid+1;
	    	  }
	    	  else if(item<a[mid])
	    	  {
	    		  end=mid-1;
	    	  }
	      }
	      if(c>0)
	      {
	    	  System.out.println("item found at "+mid);
	      }
	      else
	      {
	    	  System.out.println("Item not  found");
	      }
	}

}
