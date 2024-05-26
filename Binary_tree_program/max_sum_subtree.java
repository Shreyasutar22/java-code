package Binary_tree_program;

public class max_sum_subtree {
    static int res=0;


    int find_sum_util(Node root, int max_sum)
    {
        if(root==null)
        {
            return 0;
        }
        int sum1=root.data+find_sum_util(root.left, max_sum)+
                find_sum_util(root.right, max_sum);

        return Math.max(max_sum, sum1);
    }

    void find_sum(Node root)
    {
        int sum1=Integer.MIN_VALUE;
        res=find_sum_util(root, sum1);


    }

    public static void main(String[] args) {
        max_sum_subtree tree= new max_sum_subtree();
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    tree.find_sum(root);
    System.out.println(res);
        
    }
    
}
