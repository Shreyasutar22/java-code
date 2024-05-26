package Binary_tree_program;

public class dist_bet_two_nodes {
    static Node root;
    static int d1=-1;
    static int d2=-1;
    static int dist=0;



    static Node find_dist(Node node, int n1, int n2, int lvl)
    {
        if(node==null)
        return null;
        if(node.data==n1)
        {   d1=lvl;
            return node;

        }
        if( node.data==n2)
        {
            d2=lvl;
            return node;
        }
        
        Node l_lc= find_dist(node.left, n1, n2, lvl+1);
        Node r_lc=find_dist(node.right, n1, n2, lvl+1);
        if(l_lc!=null && r_lc!=null)
        {
           dist=d1+d2-2*lvl;
           return node;
        }
        return(l_lc!=null)?l_lc:r_lc;
    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.left=new Node(7);
        root.right.left.right=new Node(8);
        System.out.println(find_dist_util(root,4 , 5));

    }
    public static int find_dist_util(Node root, int n1, int n2)
    {
        d1=-1;
        d2=-1;
        Node lca=find_dist(root, n1, n2, 1);
        if(d1!=-1 && d2!=-1)
        {
            return dist;
        }
        if(d1!=-1)
        {
            dist=find_level(lca, n2, 0);
            return dist;
        }
        if(d2!=-1)
        {
            dist=find_level(lca, n1, 0);
            return dist;
        }
        return -1;
        
    }
    static int find_level(Node lca, int n, int lvl)
    {
        if(lca==null)
        return 1;
        if(root.data==n)
        return lvl;
        int l=find_level(lca.left, n, lvl+1);
        return (l!=-1)?l:find_level(lca.right, n, lvl+1);
    }
    
}
