package DreamJava;
//Creation and Insertion , Deletion of Array taken by user
import java.util.*;
public class Array3
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size Array element = ");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n-1];
		
		System.out.print("Enter the Array Elements = ");
		for (int i = 0; i < n; i++) 
		{
			
		  a[i]=sc.nextInt();	
		}
		System.out.print("Enter index of value to be deleted = ");
		int m =sc.nextInt();
		
		for (int i = 0; i < n; i++) // 10, 20, 30 ,40 ,50
		{
		 if(i<m)	               //10 20 80 30 40 50
		 {
			 b[i]=a[i];
		 }
		 else if(i==m)
		 {
			 continue;
		 }
		 else
		 {
			 b[i-1]=a[i];
		 }
			 
		}
		System.out.print("Elements are = ");
		
		for (int i = 0; i < n+1; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}

}
