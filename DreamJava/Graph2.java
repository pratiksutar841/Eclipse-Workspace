//Graph traversal using Breadth first search in Queue
package DreamJava;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Implementation of Graphs DS using Adjacency List
public class Graph2
{
    private LinkedList<Integer>adjacency[];
    public Graph2(int v)
    {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++)
        {
         adjacency[i]=new LinkedList<Integer>();
        }
    }
    public void insertedge(int s, int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);
        System.out.print(adjacency[d]);
        System.out.print(adjacency[s]);
    }
    public void bfs(int source)
    {
    	boolean visited_nodes[]= new boolean[adjacency.length];
    	int parent_nodes[]= new int[adjacency.length];
         Queue<Integer>q=new LinkedList<>();
         q.add(source);
         visited_nodes[source]=true;
         parent_nodes[source]=-1;
         while(!q.isEmpty())
         {
        	 int p=q.poll();
        	 System.out.print(p);
        	 for (int i: adjacency[p]) 
        	 {
			  if(visited_nodes[i]!=true)
			  {
				  visited_nodes[i]=true;
				  q.add(i);
				  parent_nodes[i]=p;
			  }
			}
         }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices and edges = ");
        int v= sc.nextInt();
        int e = sc.nextInt();
        Graph2 g= new Graph2(v);
        System.out.println("Enter edges");
        for (int i = 0; i < e ; i++)
        {
          int s= sc.nextInt();
          int d= sc.nextInt();
          g.insertedge(s,d);
        }
        
        System.out.print("Enter source for bfs traversal = ");
        int source =sc.nextInt();
        g.bfs(source);
    }
}
