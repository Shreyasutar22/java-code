package Binary_tree_program;

public class bt_balance {



    static boolean isbalanced(Node node)
    {
        int lh=height(node.left);
        int rh=height(node.right);
        if(Math.abs(lh-rh)<=1)
        {
            return true;
        }
            
        else{
            return false;

        }
            
        
    }

    static int height(Node node)
    {
        if(node==null)
        return 0;
        else 
        return (1+Math.max(height(node.left), height(node.right)));

    }

    public static void main(String[] args) {
        Node head= new Node(1);
        head.left= new Node(2);
        head.right=new Node(4);
        head.right.right= new Node(5);
        head.right.right.right= new Node(6);
        System.out.println(bt_balance.isbalanced(head));

    }
    
}
