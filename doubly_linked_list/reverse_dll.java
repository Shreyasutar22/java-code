package doubly_linked_list;

public class reverse_dll {
   static  Node  root;

    void print_list(Node root)
    {
        Node temp= root;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    void reverse()
    {
        Node curr=root;
      
        Node temp=null;
        while(curr!=null)
        {   
          temp=curr.prev;
          curr.prev=curr.next;
          curr.next=temp;
          curr=curr.prev;

            
        }
        if(temp!=null)
        {
            root=temp.prev;
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

    public static void main(String[] args) {
       

        reverse_dll ob= new reverse_dll();
        ob.push(2);
        ob.push(4);
        ob.push(8);
        ob.push(10);
        ob.print_list(root);
        ob.reverse();
        System.out.println("reversed list");

        ob.print_list(root);
    }
    
}
