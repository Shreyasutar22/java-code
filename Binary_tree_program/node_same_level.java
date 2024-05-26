package Binary_tree_program;

import java.util.LinkedList;
import java.util.Queue;

public class node_same_level {
    
    boolean check_level(Node root)
    {
        if(root==null)
        return  true;

        Queue<Node>ob= new LinkedList<>();
        ob.add(root);
        
        
        int level=0;
        
        
        int result=Integer.MAX_VALUE;
        
        
        
        
        while(ob.size()!=0)
        {
            int size=ob.size();
            
            level++;
            while(size>0)
            {
                Node temp=ob.remove();
                if(temp.left!=null)
                {
                    ob.add(temp.left);
                    if(temp.left.left==null&& temp.left.right==null)
                    {
                        if(result==Integer.MAX_VALUE)
                        {
                            result=level;
                            
                        }
                        else if(result!=level)
                        {
                            return false;
                        }
                    }
                }
                if(temp.right!=null)
                {
                    ob.add(temp.right);
                    if(temp.right.left==null&& temp.right.right==null)
                    {
                        if(result==Integer.MAX_VALUE)
                        {
                            result=level;
                            
                        }
                        else if(result!=level)
                        {
                            return false;
                        }
                    }
                }
                size--;
            }
        }
        return true;


    }


    public static void main(String[] args) {
        
        node_same_level tree= new node_same_level();
        Node root;
        
        
        root = new Node(12);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(9);
        root.left.left.left = new Node(1);
        root.left.right.left = new Node(1);
        System.out.print(tree.check_level(root)); ;



    }
    
}
