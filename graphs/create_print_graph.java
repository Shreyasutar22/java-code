package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class create_print_graph {

    public void adjacent_matrix()
    {
        Scanner sc= new Scanner(System.in);
        
        int vertices=sc.nextInt();
        int edges=sc.nextInt();
        int mat[][]= new int[vertices+1][vertices+1];
       
        for (int i = 0; i <edges; i++) {
            int m=sc.nextInt();
            int n=sc.nextInt();
            mat[m][n]=1;
            mat[n][m]=1;
            
        }
    }

    public void adjacency_list()
    {
        int v=5;
        ArrayList<ArrayList<Integer>>adj= new ArrayList<>();
        for (int i = 0; i <v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        create_print_graph ob2= new create_print_graph();
        ob2.print_list(adj);
 


    }
    public void addEdge(ArrayList<ArrayList<Integer>> ob2, int m , int n)
    {
        ob2.get(m).add(n);
        ob2.get(n).add(m);

    }

    public void print_list(ArrayList<ArrayList<Integer>> ob3)
    {
        for (int i = 0; i < ob3.size(); i++) {
            System.out.println("edges from "+i);
            for (int j = 0; j < ob3.get(i).size(); j++) {
                System.out.print(ob3.get(i).get(j)+" -> ");
            }
            System.out.println();
            
        }


    }


    public static void main(String[] args) {
        create_print_graph ob2= new create_print_graph();
        ob2.adjacency_list();
        
        
    }
    
}
