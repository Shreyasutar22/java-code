package Binary_tree_program;

import java.util.Stack;

public class left_right_view {

    Node root;
    void add(int data)
    {
        root=add1(root, data); 
    }


    Node add1(Node root, int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        
        else{
            if(data<root.data)
            {
                root.left=add1(root.left, data);
            }
            else if(data>root.data)
            {
               root.right= add1(root.right, data);
            }
            else{
                return root;
            }
            
        }
        return root;

    }

    void left_view(Node node, int level)
    {
         int max_level=0;

        if(node==null)
        return ;

        if(max_level<level)
        {
            System.out.println(node.data+" ");
            max_level=level;

        }

        left_view(node.left, level+1);
        left_view(node.right, level+1);
        
    }

    void zigzag(Node root)
    {
        Stack<Node> current_level= new Stack<>();
        Stack<Node> next_level= new Stack<>();
        boolean left_to_right=true;
        current_level.push(root);
        while(!current_level.isEmpty())
        {
            Node temp= current_level.pop();
            System.out.println(temp.data);
            if(left_to_right)
            {
                if(temp.left!=null)
                next_level.push(temp.left);
                if(temp.right!=null)
                next_level.push(temp.right);
            }         
            else{
                if(temp.right!=null)
                next_level.push(temp.right);
                if(temp.left!=null)
                next_level.push(temp.left);
            }

            if(current_level.isEmpty())
            {
                left_to_right=!left_to_right;
                Stack<Node>temp1;
                temp1=current_level;
                current_level=next_level;
                next_level=temp1;
                
            }


           

        }
    }
    
}
