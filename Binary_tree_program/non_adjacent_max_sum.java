package Binary_tree_program;

import java.util.HashMap;

public class non_adjacent_max_sum {

    int max_sum(Node root)
    {
        HashMap<Node, Integer>map= new HashMap<>();
        int res= max_sum_util(root,map);
        return res;
    }

    int max_sum_util(Node root, HashMap<Node,Integer>map)
    {
        if(root==null)
        return 0;

        if(map.containsKey(root))
        {
            return map.get(root);
        }
        
        int inc=root.data+sum_grandchild(root.left)+sum_grandchild(root.right);
        int exc=max_sum_util(root.left,map)+max_sum_util(root.right,map);

        map.put(root, Math.max(inc, exc));

        return map.get(root);
    }
    int sum_grandchild(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int sum=0;
        if(node.left!=null)
        sum+=(sum_grandchild(node.left.left)+sum_grandchild(node.left.right));
        if(node.right!=null)
        sum+=(sum_grandchild(node.right.left)+sum_grandchild(node.right.right));
        
        return sum;
    }

    



    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left = new Node(1);
        non_adjacent_max_sum tree= new non_adjacent_max_sum();
        System.out.print(tree.max_sum(root)); 
    }
    
}
