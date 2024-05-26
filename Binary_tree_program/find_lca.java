package Binary_tree_program;

public class find_lca {

    static Node find_lca_2(Node root, int n1, int n2 )
    {
        if(root==null)
        {
            return null;
        }
        if(root.data==n1|| root.data==n2)
        {
            return root;
        }

        Node left=find_lca_2(root.left, n1, n2);
        Node right=find_lca_2(root.right, n1, n2);

        if(left==null && right==null)
        {
            return null;
        }
        if(left!=null && right!=null)
        {
            return root;
        }
        if(left!=null)
        {
            return left;
        }else{
            return right;
        }

    }

    static int find_lca_3(Node root, int n1, int n2)
    {
        return find_lca.find_lca_2(root, n1, n2).data;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);

        System.out.println(find_lca.find_lca_3(root, 4, 7));
    }
    
}
