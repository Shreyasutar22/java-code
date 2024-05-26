package Binary_tree_program;

public class max_sum_longest_path {

    static int  max_length=0;
    static int  max_sum=Integer.MIN_VALUE;

    int check_max(Node root)
    {
        if(root==null)
        return 0;
         check_sum_util(root, 0, 0);
         return max_sum;
    }
    void check_sum_util(Node root, int sum1, int length)
    {
        if(root==null)
        {
            if( length>max_length)
            {
                max_sum=sum1;
                max_length=length;                
                
            }
            return;
        }
        check_sum_util(root.left, sum1+root.data, length+1);
        check_sum_util(root.right, sum1+root.data, length+1);
       
    }

    public static void main(String[] args) {
        max_sum_longest_path ob= new max_sum_longest_path();


        Node root = new Node(4);         /*        4        */
        root.left = new Node(2);         /*       / \       */
        root.right = new Node(5);        /*      2   5      */
        root.left.left = new Node(7);    /*     / \ / \     */
        root.left.right = new Node(1);   /*    7  1 2  3    */
        root.right.left = new Node(2);   /*      /          */
        root.right.right = new Node(3);  /*     6           */
        root.left.right.left = new Node(6);
        System.out.println(ob.check_max(root)); 
        
    }
    
}
