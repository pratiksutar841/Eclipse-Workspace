import java.lang.reflect.Array;
import java.util.ArrayList;
public class Graphs1 
{
          static class Edge
          {
             int src;
             int dest;
             public Edge(int s, int d)
             {
                    this.src=s;
                    this.dest=d;
             }
          }
          
   public static void main(String[] args) 
   {
        int v=5;
       ArrayList<Edge>[]graph=new ArrayList[v];
       for (int i = 0; i < v; i++) 
       {
          graph[i]=new ArrayList<>();
       } 
       graph[0].add(new Edge(0, 2));//0- vertex                   //   0
                                                                  //    \     3
       graph[1].add(new Edge(1, 2));//1 vertex                    //     \   / \
       graph[1].add(new Edge(1, 3));                              //      \ /   \
                                                                  //       2---- 1
                                                                  //
       graph[2].add(new Edge(2, 0));// 2 vertex                   //
       graph[2].add(new Edge(2, 1));                              //
       graph[2].add(new Edge(2, 3));                              //

       graph[3].add(new Edge(3, 1));// 3 vertex
       graph[3].add(new Edge(3, 2));

       graph[4].add(new Edge(4, 2));// 4 vertex

       //2's  neighbors
       for (int i = 0; i < graph[2].size(); i++) 
       {
          Edge e = graph[2].get(i);
          System.out.println(e.dest);
       }
       
   }       
}
