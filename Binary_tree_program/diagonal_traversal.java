package Binary_tree_program;

import java.security.KeyStore.Entry;
import java.util.*;
import java.security.*;

public class diagonal_traversal {


    static void create_diagonal_util(Node root, int d, TreeMap<Integer,Vector<Integer>>diagonal_print)
    {
        if(root==null)
        {
            return;
        }
        Vector<Integer>k=diagonal_print.get(d);
        if(k==null)
        {
            k=new Vector<>();
            k.add(root.data);
        }
        else{
            k.add(root.data);
        }
        diagonal_print.put(d, k);
        create_diagonal_util(root.left, d+1, diagonal_print);
        create_diagonal_util(root.right, d, diagonal_print);

    }


    static void create_diagonal(Node root)
    {
        TreeMap<Integer,Vector<Integer>>diagonal_print= new TreeMap<>();
        create_diagonal_util(root, 0, diagonal_print);
      for(java.util.Map.Entry<Integer, Vector<Integer>> entry:diagonal_print.entrySet())
      {
        System.out.println(entry.getValue());
      }


    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        diagonal_traversal.create_diagonal(root);


    }
    
}
