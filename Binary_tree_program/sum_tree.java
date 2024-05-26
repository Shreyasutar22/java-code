package Binary_tree_program;

public class sum_tree {
    static Node root;
    


    int find_sum(Node node)
    {
        if(node==null)
        {
            return 0;

        }
        return (find_sum(node.left)+find_sum(node.right)+node.data);
    }


    int check_sum(Node node)
    {

        if(node==null|| node.left==null&&node.right==null )
        {
            return 1;
        }
        int left_sum=find_sum(node.left);

        int right_sum=find_sum(node.right);

        if((node.data==left_sum+right_sum)&& check_sum(node.left)!=0 &&check_sum(node.right)!=0)
        {
            return 1;
        }
        return 0;

    }




    public static void main(String[] args) {
        

        sum_tree tree = new sum_tree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);
        if(tree.check_sum(root)==1)
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
    
}
