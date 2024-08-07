//Creation and Insertion , Deletion of  2D Array taken by user
package DreamJava;
import java.util.*;
public class Array4
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter No. of Rows = ");
		int n = sc.nextInt();
		System.out.print("Enter No. of Column = ");
		int m = sc.nextInt();
		
		int a[][]=new int[n][m];
		
		
		System.out.print("Enter the Array Elements = ");
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++) 
			{
				a[i][j]=sc.nextInt();
			}
		 
		}			
		for (int i = 0; i < n; i++) 
		{

			for (int j = 0; j < m; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
