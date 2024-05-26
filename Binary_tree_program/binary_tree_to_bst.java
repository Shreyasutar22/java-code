package Binary_tree_program;

import java.util.Arrays;

public class binary_tree_to_bst {
    int index=0;

    void inorder_count(Node root)
    {
        if(root==null)
        {
            return;
        }
        int n=count_root(root);
        int[] ar= new int[n];
        inorder(root, ar);

       
        System.out.println();
        Arrays.sort(ar);
        index=0;
        array_to_bst(ar, root);


    }

    void array_to_bst(int[] ar, Node root)
    {
        if(root==null)
        {
            return;
        }
        array_to_bst(ar, root.left);
        root.data=ar[index];
        index++;
        array_to_bst(ar, root.right);

    }
    void inorder(Node root, int[] ar)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left, ar);
        ar[index]=root.data;
        index++;
        inorder(root.right, ar);
    }

    int count_root(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        return count_root(root.left)+count_root(root.right)+1;
    }
    void print_inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        print_inorder(root.left);
        System.out.println(root.data);
        print_inorder(root.right);
    }


    public static void main(String[] args) {
        Node root =new  Node(10);
        root.left =new  Node(30);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.right.right = new Node(5);


        binary_tree_to_bst tree= new binary_tree_to_bst();
        tree.inorder_count(root);
        tree.print_inorder(root);
    }
    
}
