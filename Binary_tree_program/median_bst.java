package Binary_tree_program;

public class median_bst {
    int count=0;

    void calc_node(Node node, int high, int low)
    {
        
        if(node==null)
        {
            return;
        }
        calc_node(node.left, high, low);

        if(node.data<high && node.data>=low)
        {
            count++;
        }
        
        calc_node(node.right, high, low);
        
    }

    
   
    int count_in_range(Node root, int high, int low)
    {
        calc_node(root, high, low);
        return count;
    }

    public static void main(String[] args) {
       Node root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(5);
        root1.left.left=new Node(0);
        root1.left.right=new Node(10);
        median_bst ob= new median_bst();
       
        System.out.println( ob.count_in_range(root1, 5, 0));
 
    }
    
}
