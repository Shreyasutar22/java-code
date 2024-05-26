package Binary_tree_program;

public class boundary_traversal {
   static Node head;

   void bound_traversal(Node head)
   {
        if(head==null)
        return ;
        System.out.println(head.data);
        p_left(head.left);
        p_leaf(head.left);
        p_leaf(head.right);

        p_right(head.right);

   }

   void p_left(Node node)
   {
    if(node==null)
    return;
    if(node.left!=null)
    {
        p_left(node.left);
        System.out.println(node.data);
    }
    if(node.right!=null)
    {
        p_left(node.right);
        System.out.println(node.data);
    }
   }
   void p_right(Node node)
   {
    if(node==null)
    return;
    if(node.right!=null)
    {
        p_left(node.right);
        System.out.println(node.data);
    }
    if(node.left!=null)
    {
        p_left(node.left);
        System.out.println(node.data);
    }
   }
   void p_(Node node)
   {
    if(node==null)
    return;
    if(node.left!=null)
    {
        p_left(node.left);
        System.out.println(node.data);
    }
    if(node.right!=null)
    {
        p_left(node.right);
        System.out.println(node.data);
    }
   }
    public static void main(String[] args) {
        head= new Node(1);
        head.left= new Node(2);
        head.right=new Node(3);
        head.left.left= new Node(4);
        head.left.right=new Node(5);
        head.right.left= new Node(6);
        head.right.right= new Node(7);
        head.left.left.left= new Node(8);
        head.left.left.right= new Node(9);
        head.left.right.left= new Node(10);
        head.left.right.right= new Node(10);



        
        
    }
}
