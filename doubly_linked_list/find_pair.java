package doubly_linked_list;

public class find_pair {
    static Node root;
    
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

       static void pairSum(Node root, int x)
        {
            Node first=root;
            Node sec=root;
            while(sec.next!=null)
            {
                sec=sec.next;
            }
            while(sec!=first && sec!=first.next)
            {
                if(first.data+sec.data==x)
                {
                    System.out.println(first.data+" "+sec.data+" ");
                    first=first.next;
                    sec=sec.prev;
                    
                }else if(first.data+sec.data>x)
                {
                    sec=sec.prev;
                }else{
                    first=first.next;
                }
            }
        }
        public static void main(String[] args) {
            find_pair ob= new find_pair();
            
             ob.push(9);
             ob.push(8);
            ob.push(6);
             ob.push(5);
              ob.push( 4);
              ob.push( 2);
             ob.push( 1);
            int x = 7;
            pairSum(root, x);


        }
}
    

