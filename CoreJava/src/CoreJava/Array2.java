package CoreJava;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array = ");
      int n = sc.nextInt();
      int roll[]=new int[n];
      System.out.println("Enter the roll numbers ");
      for (int i = 0; i < roll.length; i++) 
      {
		roll[i]=sc.nextInt();
	  }
      System.out.print("Roll numbers are = ");
      for (int i = 0; i < roll.length; i++) {
		System.out.print(roll[i]);
	}
	}

}
