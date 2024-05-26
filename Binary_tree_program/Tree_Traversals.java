package Binary_tree_program;

import javax.xml.crypto.Data;

public class Tree_Traversals {
    static Node root;
    Tree_Traversals()
    {
        root=null;
    }

    public Node preorder1(Node root)
    {
        if(root==null)
        return null;

        System.out.print(root.data+"  ");
        preorder1(root.left);
        preorder1(root.right);
        return root;

    }
    public void preorder()
    {
       preorder1(root);
    }


    public Node postorder1(Node root)
    {
        if(root==null)
        return null;

       
        postorder1(root.left);
        postorder1(root.right);
        System.out.print(root.data+"  ");
        return root;

    }
    public void postorder()
    {
        postorder1(root);
    }

    public Node inorder1(Node root)
    {
        if(root==null)
        return null;

       
        inorder1(root.left);
        System.out.print(root.data+"  ");
        inorder1(root.right);
      
        return root;

    }
    public void  inorder()
    {
        inorder1(root);
    }

   

    public static void main(String[] args) {

        Tree_Traversals tree= new Tree_Traversals();
         root= new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right = new Node(-1);
        root.right.left = new Node(4);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(2);
      //tree.inorder();
     // System.out.println();
     // tree.postorder();
      System.out.println();
      tree.preorder();
 
        
    }
    
}
