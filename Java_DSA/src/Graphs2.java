import java.lang.reflect.Array;
import java.util.ArrayList;
public class Graphs2 
{
          static class Edge
          {
             int src;
             int dest;
             int wt;
             public Edge(int s, int d, int wt)
             {
                    this.src=s;
                    this.dest=d;
                    this.wt=wt;
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
       graph[0].add(new Edge(0,2,2));//0- vertex                   //   0
                                                                   //    \     3
       graph[1].add(new Edge(1,2,10));//1 vertex                   //    2\ -1/ \0
       graph[1].add(new Edge(1,3,0));                              //      \ /   \
                                                                   //       2---- 1
                                                                   //         10
       graph[2].add(new Edge(2,0,2));// 2 vertex                   //
       graph[2].add(new Edge(2,1,10));                             //
       graph[2].add(new Edge(2,3,-1));                             //

       graph[3].add(new Edge(3,1,0));// 3 vertex
       graph[3].add(new Edge(3,2,-1));
       //2's  neighbors
       for (int i = 0; i < graph[2].size(); i++) 
       {
          Edge e = graph[2].get(i);
          System.out.println(e.dest+" , "+e.wt);
       }
       
   }       
}


