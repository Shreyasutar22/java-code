package graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class check_cycle {


    LinkedList<Integer> ar[];
    int v;
    check_cycle(int v)
    {
        this.v=v;
        ar= new LinkedList[v];
        for (int i = 0; i < v; i++) {
            ar[i]=new LinkedList<>();
        }
    }

    void addEdge(int m, int n)
    {
        ar[m].add(n);
        ar[n].add(m);
    }

    

    boolean iscyclicutil(int u, boolean[] visited, int parent)
    {
        visited[u]=true;
       

        Iterator<Integer>ob1=ar[u].iterator();
        while(ob1.hasNext())
        {
            int n=ob1.next();

            if(!visited[n])
            {
                if(iscyclicutil(n, visited, u))
                return true;
            }
            else if(n!=parent)
            {
                return true;
            }
        }
        return false;

    }

    boolean isCyclic()
    {
        boolean visited[]= new boolean[v];
       for(int i=0; i<v ;i++)
       {
        if(!visited[i]){
            if(iscyclicutil(i,visited, -1))
            {
                return true;
            }

        }
       
        
       }
       return false;
    }




    public static void main(String[] args) {

        check_cycle g1 = new check_cycle(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
 
            check_cycle g2 = new check_cycle(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        if (g2.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
        
    }
    
}
