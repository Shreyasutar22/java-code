package Binary_tree_program;



public class bst {
    Node root=null;
    int count=0;

     Node add_node_rec(Node node, int k)
    {
        if(node==null||node.data==k)
        {
            node= new Node(k);
            return node;

        }else if(k<node.data){
           
             root.left=(add_node_rec(node.left, k));

        }
        else if(k>node.data)
        {
            node.right=(add_node_rec(node.right, k));
        }
        return node;
    }

    void add_node(int k)
    {
        root=add_node_rec(root, k);
        
    }

    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
   
    public static void main(String[] args) {
        bst t= new bst();

        t.add_node(30);
        t.add_node(10);
        t.add_node(50);
        t.inorderRec(t.root);
        System.out.println(t.find_value(50)); 
        
        System.out.println(t.chec_bst(t.root)); 
    }

    int  find_value(int k)
    {
        Node temp=root;
        int res=find_val_rec(temp,k, count);
        return res;
    }
    int find_val_rec(Node node, int k, int count)
    {
        if(node==null)
        {
            return -1;
        }else if(k==node.data)
        {
            return count+1;
        }else if(k<node.data)
        {
            return find_val_rec(node.left, k, count+1);
        }else{
            return find_val_rec(node.right, k, count+1);
        }
    }

    Node del_node(Node root, int k)
    {
        if(root==null)
        {
            return root;
        }

        if(k<root.data)
        {
            root.left=del_node(root.left, k);
        }else if(k>root.data)
        {
            root.right=del_node(root.right, k);
        }else{
            if(root.left==null)
        {
            return root.right;

        }else if(root.right==null)
        {
            return root.left;
        }
        Node sucparent=root.right;
            while(sucparent.left!=null)
            {
                sucparent=sucparent.left;
            }
            root.data=sucparent.data;
            sucparent.right=del_node(root.right, root.data);


        }
        
            
            
        
        return root;
    }


    boolean chec_bst(Node root)
    {
        return check_bst_util(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean check_bst_util(Node root, int min, int max)
    {
        if(root==null)
        {
            return true;
        }

        if(root.data< min|| root.data>max)
        {
            return false;
        }

        return (check_bst_util(root.left, min, root.data) && check_bst_util(root.right, root.data, max));
    }



    


   
 }

    
