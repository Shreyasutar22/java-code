package Binary_tree_program;

public class Mirror_tree {
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
    void inorder_display(Node node)
    {
        if(node==null)
        {
            return;
        }
        else{ 
        inorder_display(node.left);
        System.out.println(node.data);
        inorder_display(node.right);

        }
    }
        

  
    void inorder_display1()
    {
        inorder_display(root);
    }
    void mirror_tree()
    {
        root=mirror_tree_start(root);
    }
    Node mirror_tree_start(Node node)
    {
        if(node==null)
        return node;
            Node left= mirror_tree_start(node.left);
            Node right= mirror_tree_start(node.right);
            node.left=right;
            node.right=left;
        
        return node;
       

    }

    
    public static void main(String[] args) {
        Mirror_tree ob1= new Mirror_tree();
        ob1.add(1);
        ob1.add(2);
        ob1.add(3);
        ob1.add(4);
        ob1.add(5);
        
        ob1.inorder_display1();
        ob1.mirror_tree();
        System.out.println("after mirroring");
        ob1.inorder_display1();
        
    }
    
}
