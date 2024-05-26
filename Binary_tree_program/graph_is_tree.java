package Binary_tree_program;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class graph_is_tree {
    int v=5;
   LinkedList<Integer>adj[];

   graph_is_tree()
   {
                 adj= new LinkedList[v];


                    for (int i = 0; i < v; i++) 
                    adj[i]= new LinkedList<Integer>();

   }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }


    boolean check_cycle()
    {
        boolean visited[]=new boolean[v];

       

        Arrays.fill(visited,false);

        if(check_cycle_util(visited,0, -1))
        return false;

        return true;
    }

    boolean check_cycle_util(boolean visited[],int v, int parent)
    {
        visited[v]=true;
        int i;
        Iterator <Integer> it=adj[v].iterator();
        while(it.hasNext())
        {
            i=it.next();
            if(!visited[i])
            {
                if(check_cycle_util(visited, i, v))
                return true;
            }
            else if(i!=parent)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        graph_is_tree g1 = new graph_is_tree();
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.check_cycle())
            System.out.println("Graph is Tree");
        else
            System.out.println("Graph is not Tree");
        
    }
    
}
