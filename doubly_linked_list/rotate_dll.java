package doubly_linked_list;

public class rotate_dll {
    static Node root;
    
    void print_list(Node root)
    {
        Node temp= root;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    void push(int new_data)
    {
       
        Node new_node = new Node(new_data);
 
       
        new_node.prev = null;
 
      
        new_node.next = root;
 
      
        if (root != null) {
            root.prev = new_node;
        }
 
       
        root = new_node;
    }

    void rotate_list(Node root, int n)
    {
        if(n==0)
        return;
        Node current=root;
        int count=1;
        while(count<n && current!=null)
        {
            current=current.next;
            count++;
        }

        if(current==null)
        return;

        Node nthnode=current;

        while(current.next!=null)
        current=current.next;

        current.next=root;
        (root).prev=current;
        root=nthnode.next;
        (root).prev=null;
        nthnode.next=null;

    }
    public static void main(String[] args) {
        rotate_dll ob= new rotate_dll();
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(5);
        ob.push(6);
        ob.rotate_list(root, 2);
        ob.print_list(root);
        
        

        
    }
    
}
