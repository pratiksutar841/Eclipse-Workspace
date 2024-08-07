package DreamJava;
import java.util.Scanner;

import java.util.Stack;

public class CollectionFramework2
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        Stack<Integer>c=new Stack<Integer>();
        c.push(10);
        c.push(20);
        c.push(30);
        c.push(40);
        c.push(50);
        c.push(60);
        int d = c.peek();
        System.out.println(c);
        c.pop();
        int e = c.search(200);
        System.out.println(e);
        
        
        for (int i = 0; i < 5; i++) 
        {
			System.out.print("Enter your number = ");
			int value = sc.nextInt();
			c.push(value);
		}
        System.out.println(c);


    }
}
