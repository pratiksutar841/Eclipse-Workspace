//Binary tree creation
package DreamJava;
import java.util.*;
public class Trees1
{
 static class Node
  {
      Node left,right;
      int data;
      public Node(int data)
      {
          this.data=data;
          left=null;
          right=null;
      }
  }
 static Node create()
  {
      
      Scanner sc = new Scanner(System.in);
      Node root=null;
      System.out.print("Enter value = ");
      int data = sc.nextInt();
      if (data==-1) 
      {
          return null;
      }
      root = new Node(data);
      System.out.println("Enter left child of "+root.data);
      root.left=create();
      
      System.out.println("Enter right child of "+root.data);
      root.left=create();
      
      return root;
  }
 
 
  public static void main(String[] args)
  {
      Node root = create();
  }

}
