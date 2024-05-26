package Binary_tree_program;
import java.util.*;

public class merge_bst {
    public static void main(String[] args) {
        Node root1 = null, root2 = null;
 
        /* Let us create the following tree as first tree
                3
            / \
            1 5
        */
        root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(5);
 
        /* Let us create the following tree as second tree
                4
            / \
            2 6
        */
       /*root2 = new Node(4);
        root2.left = new Node(2);
        root2.right = new Node(6); */ 
        
 
        // Print sorted nodes of both trees
        merge(root1, root2);
    }

   static void merge(Node root1, Node root2)
    {

        Stack<Node>s1= new Stack<Node>();
        Stack<Node>s2= new Stack<Node>();
        List<Integer>res= new ArrayList<>();

        while(root1!=null || root2!=null||!s1.isEmpty()||!s2.isEmpty())
        {
            while(root1!=null)
            {
                s1.push(root1);
                root1=root1.left;
            }
            while(root2!=null)
            {
                s2.push(root2);
                root2=root2.left;
            }
            if(s2.isEmpty()||(!s1.isEmpty()&&(s1.peek().data<=s2.peek().data)))
            {
                root1=s1.peek();
                s1.pop();
                res.add(root1.data);
                root1=root1.right;

            }else{
                root2=s2.peek();
                s2.pop();
                res.add(root2.data);
                root2=root2.right;
            }

        }
        for(int i:res)
        {
            System.out.println(i);
        }
        

    }
    
    
}
