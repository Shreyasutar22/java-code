package graphs;
import java.util.*;

public class bfs {
    LinkedList adj[];
    int v;


    bfs(int v)
    {
        this.v=v;
        adj = new LinkedList[v];
        for (int i = 0; i <v; i++) {
            adj[i]= new LinkedList<>();
        }

    }

    public void addEdge( int m , int n)
    {
        adj[m].add(n);

    }

    public void print_bfs(int s)
    {
        LinkedList<Integer> queue= new LinkedList<Integer>();
        boolean[] visited=new boolean[5];
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0)
        {
            s=queue.poll();
            System.out.println(s+" ");

            Iterator <Integer>i= adj[s].listIterator();
          // System.out.println(i.next());
           while (i.hasNext()) {
            int n=i.next();
            if(!visited[n])
            {
                visited[n]=true;
                queue.add(n);
            }
            
        }
        }

    }





    public static void main(String[] args) {
        bfs g= new bfs(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.print_bfs(2);
    
        

        
    }
    
}
