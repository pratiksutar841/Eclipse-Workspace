package DreamJava;
//Creation and Insertion of Array taken by user
import java.util.*;
public class Array2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size Array element = ");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n+1];
		
		System.out.print("Enter the Array Elements = ");
		for (int i = 0; i < n; i++) 
		{
			
		  a[i]=sc.nextInt();	
		}
		System.out.print("Enter index of new value to be inserted = ");
		int m =sc.nextInt();
		System.out.print("Enter new value to be inserted = ");
		int p =sc.nextInt();
		for (int i = 0; i < n+1; i++) // 10, 20, 30 ,40 ,50
		{
		 if(i<m)	               //10 20 80 30 40 50
		 {
			 b[i]=a[i];
		 }
		 else if(i==m)
		 {
			 b[i]=p;
		 }
		 else
		 {
			 b[i]=a[i-1];
		 }
			 
		}
		System.out.print("Elements are = ");
		
		for (int i = 0; i < n+1; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}

}
