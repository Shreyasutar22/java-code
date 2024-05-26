package Binary_tree_program;

import java.util.ArrayList;
import java.util.Stack;

public class populate_inorder {


    void inorder(Node node, ArrayList<Integer>ob)
    {

        if(node==null)
        {
           
            return ;
        }
       
        inorder(node.left, ob) ;
        ob.add(node.data);
        inorder(node.right, ob);



    }

    void inorder_util(Node node)
    {
      ArrayList<Integer>ob= new ArrayList<>();
       
      inorder(node, ob);
      int i;
        for ( i= 0; i < ob.size()-1; i++) {
            System.out.print(ob.get(i)+"->"+ob.get(i+1)+" ");
        }
       // System.out.print(ob.get(i)+"->"+-1);
    }

    public static void main(String[] args) {
        Node root= new Node(10);
        root.left= new Node(8);
        root.right=new Node(12);
        root.left.left= new Node(3);
       
       
        populate_inorder a=new populate_inorder();
        a.inorder_util(root);
    }
    
}
