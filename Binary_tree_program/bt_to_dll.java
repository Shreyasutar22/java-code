package Binary_tree_program;

public class bt_to_dll {
    static Node root;
    Node head;
    static Node prev=null;
    
     void find_root(Node root)
    {
        if(root==null)
        return;

        find_root(root.left);

        if(prev==null)
        {
            head=root;
        }else{
            root.left=prev;
            prev.right=root;

        }
        prev=root;

        find_root(root.right);

        
    }
    void printList(Node node)
    {
        while (node != null) 
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
   
    
    public static void main(String[] args) {
        bt_to_dll tree = new bt_to_dll();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
    tree.find_root(root);
    tree.printList(tree.head); 
    
    }
    
}
