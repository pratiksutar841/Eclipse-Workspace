//Stack implementation using LinkedList
package DreamJava;
import java.util.Scanner;
class stackE
{
		  static class Node
		  {
		   int data;
		   Node next;
		   Node(int data)
		       {
		        this.data = data;
		        this.next = null;
		       }
		  }
		   Node top = null;


		public void push()
		  {
		   Scanner sc =new Scanner(System.in);
		   System.out.print("Enter data = ");
		   int data = sc.nextInt();
		   Node new_node = new Node(data);
		    if(top == null)
		       {
		        top = new_node;
		       }
		    else
		       {
		        new_node.next=top;
		        top=new_node;
		       }
		  }


		void pop()
		  {
		   if(top==null)
		     {
		      System.out.println("Stack is empty");
		     }
		   else
		     {
		      top=top.next;
		     }
		  }


		void display()
		  {
		   Node temp=top;
		   while(temp!=null)
		       {
		        System.out.println(temp.data);
		        temp=temp.next;
		        }
		  }


}
public class Stack2
{
  public static void main(String[] args)
  {
      int d, l;
      Scanner sc = new Scanner(System.in);
      stackE s = new stackE();
      do {
          System.out.println("Press 1 to push");
          System.out.println("Press 2 to pop");
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
          System.out.print("Enter any key to exit = ");
          l = sc.nextInt();
      }while (l==0);
      System.out.println("Exit sucessfully");
  }
}

