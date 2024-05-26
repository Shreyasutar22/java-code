package Binary_tree_program;

public class check_balance {

     public int check_height(Node root)
     {
        int lh= check_height(root.left);
        if(lh==-1)
        return -1;
        int rh=check_height(root.right);
        if(rh==-1)
        return  -1;
        else{
            if(Math.abs(lh-rh)>1)
            return -1;
            else{
                return Math.max(rh,lh)+1;
            }
        }
    }

    Node root;
    void add(int data)
    {
        root=add1(root, data); 
    }
    Node add1(Node root, int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        
        else{
            if(data<root.data)
            {
                root.left=add1(root.left, data);
            }
            else if(data>root.data)
            {
               root.right= add1(root.right, data);
            }
            else{
                return root;
            }
            
        }
        return root;

    }

    public int check_height1()
    {
        return check_height(root);
    }


    public static void main(String[] args) {

        check_balance ob1= new check_balance();
        ob1.add(1);
        ob1.add(2);
        ob1.add(3);
        ob1.add(4);
        ob1.add(5);
        int n=ob1.check_height1();
        System.out.println(n);
        
    }
}
