package Binary_tree_program;

public class tree_in_pre {

    int preorder=0;
    Node root;
    Node find_root(char[] pre, char[] in, int si,int ei)
    {
        if(si>ei)
        return null;
        Node tnode= new Node(pre[preorder++]);
        if(si==ei)
        return tnode;
        int index=search(in,si, ei,tnode.data);
        tnode.left=find_root(pre, in, si, index-1);
        tnode.right=find_root(pre, in, index+1, ei);
        return tnode;



    }

    int search(char[] in,int start,int end ,char data)
    {
        int i;
        for(i=start; i<=end; i++)
        {
            if(data==in[i])
            {
                return i;
            }
        }
        return i;

    }
    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.data + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }
        
    



    
    
    public static void main(String[] args) {
        tree_in_pre tree= new tree_in_pre();
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = in.length;
        Node root = tree.find_root(pre, in, 0, len - 1);
        tree.printInorder(root);
        
    }
    
}
