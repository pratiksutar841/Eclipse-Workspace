package DreamJava;
//Creation and Implementation of Array taken by user
import java.util.*;

public class Array1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size Array element = ");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.print("Enter the Array Elements = ");
		for (int i = 0; i < n; i++) 
		{
			
		  a[i]=sc.nextInt();	
		  
		}
		System.out.print("Print the Array Elements = ");
		
		for (int i = 0; i < n; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
