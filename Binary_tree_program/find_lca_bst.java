package Binary_tree_program;

public class find_lca_bst {
    Node root;

    Node find_lca(Node root, int m, int n)
    {
        if(root==null)
        return null;
        if(root.data>m &&root.data>n)
        {
            return find_lca(root.left, m, n);
        }
        else if(root.data<m && root.data<n){
            return find_lca(root.right, m, n);
        }

        return root;

    }




    public static void main(String[] args) {
        find_lca_bst tree = new find_lca_bst();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        System.out.println(tree.find_lca(tree.root, 10, 14).data);
    }
    
}
