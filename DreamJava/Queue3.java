//Circular  Queue
package DreamJava;
import java.util.Scanner;
class queue5
{
int f=-1, r=-1;
int n=10;
int q[] = new int[n];

void push()     //enqueue       //O(1)
{
    Scanner sc = new Scanner(System.in);
    if (f==(r+1)%n)
    {
        System.out.print("Overflow");
    }
    else
    {
        System.out.println("Enter data");
        int i = sc.nextInt();
       if (f==-1 && r==-1)
       {
           f=0;
           r=0;
           q[r]=i;
       }
       else
       {
           r=(r+1)%n;
           q[r]=i;
       }

    }
}
void  pop() //dequeue        //O(1)
{
    if (f==-1 && r==-1)
    {
        System.out.print("Underflow");
    }
    else if(f==r)
    {
    	  System.out.print("Underflow");
    	  f=-1;
    	  r=-1;
    }
    else
    {
       f=(f+1)%n;
    }
}
void  display()
{  int i ;
    System.out.println("Item are = ");
    for ( i = f; i !=r ; i=(i+1)%n)
    {
        System.out.println(q[i]+" ");
    }
    System.out.println(q[i]);
}
}

public class Queue3
{
public static void main(String[] args)
{
    int d, l;
    Scanner sc = new Scanner(System.in);
    queue5 s = new queue5();
    do {
        System.out.println("Press 1 to push");//enqueue
        System.out.println("Press 2 to pop");//dequeue
        System.out.println("Press 3 to display");
        System.out.print("Enter  your choice = ");
        d = sc.nextInt();
        switch (d)
        {
            case 1: s.push();
                    break;
            case 2: s.pop();
                    break;
            case 3: s.display();
                    break;
        }

        System.out.println("Enter 0 to go back the main menu ");
        System.out.println("Enter any key to exit = ");
        l = sc.nextInt();
       }while (l==0);
    System.out.println("Exit sucessfully");
}
}

