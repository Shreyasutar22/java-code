package Binary_tree_program;

public class mirror_or_not {


    boolean check_mirror(Node root1, Node root2)
    {
        return check_mirro_util(root1.right, root2.left);

    }

    boolean check_mirro_util(Node root1, Node root2)
    {
        if(root1==null &&root2==null)
        {
            return true;
        }
        if(root1==null || root2==null)
        {
            return false;
        }
        if(root1.data==root2.data)
        {
            return(check_mirro_util(root1.right, root2.left)&&check_mirro_util(root1.left, root2.right));
        }
        return false;

       
    }

    public static void main(String[] args) {
        mirror_or_not tree = new mirror_or_not();
        Node a = new Node(1);
        Node b = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);
 
        b.left = new Node(3);
        b.right = new Node(2);
        b.right.left = new Node(5);
        b.right.right = new Node(4);
 
        if (tree.check_mirror(a, b) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
