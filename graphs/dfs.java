package graphs;
import java.util.*;

public class dfs {
    LinkedList adj[];
    int v;


    dfs(int v)
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

    public void print_dfs1(int s, boolean visited[])
    {
        visited[s]=true;

        System.out.println(s+" ");

        Iterator<Integer>i=adj[s].listIterator();


        while(i.hasNext()){
            int n=i.next();
            if(!visited[n])
            {
                print_dfs1(n, visited);
            }
        }
    }
    public void print_dfs()
    {
        boolean visited[]= new boolean[4];
      print_dfs1(1,visited);
        
    }





    public static void main(String[] args) {
        dfs g= new dfs(5);
         g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        
        g.print_dfs();
    
        

        
    }
    
}
