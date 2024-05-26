package Binary_tree_program;

import java.util.ArrayList;

public class bst_to_balanced_bst {
    void sort_node(Node root, ArrayList ob)
    {
        if(root==null)
        {
            return ;
        }
        sort_node(root.left, ob);
        ob.add(root);
        sort_node(root.right, ob);
    }



    void convert_bst(Node root)
    {
        ArrayList<Node>ob= new ArrayList<>();
        sort_node(root,ob);
        root=convert_bst_util(ob, 0, ob.size()-1);
        print_inorder(root);

    }
    void print_inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        print_inorder(root.left);
        System.out.println(root.data);
        print_inorder(root.right);
    }
    Node convert_bst_util( ArrayList<Node>ob, int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(end+start)/2;
        Node node=ob.get(mid);
        node.left=convert_bst_util(ob,  start, mid-1);
        node.right=convert_bst_util(ob,  mid+1, end);
        return node;

    }

    public static void main(String[] args) {
        bst_to_balanced_bst tree = new bst_to_balanced_bst();
       Node  root = new Node(10);
       root.left = new Node(8);
       root.left.left = new Node(7);
        root.left.left.left = new Node(6);
        root.left.left.left.left = new Node(5);
        tree.convert_bst(root);
    }
    
}
