package doubly_linked_list;
import java.util.*;
class compareNode implements Comparator<Node>
{
    public int compare(Node n1, Node n2)
    {
        return n1.data-n2.data;
    }
}

public class k_sorted_ll {


    Node sort_list(Node head, int k)
    {
        if(head==null)
        {
            return head;
        }
        PriorityQueue<Node>pq= new PriorityQueue<>(new compareNode());
        Node newnode=null;
        Node last=null;
        for(int i=0; head!=null&&i<=k; i++)
        {
            pq.add(head);
            head=head.next;
        }
        while(!pq.isEmpty())
        {
            if(newnode==null)
            {
                newnode=pq.peek();
                newnode.prev=null;
                last=newnode;
            }else{
                last.next=pq.peek();
                pq.peek().prev=last;
                last=pq.peek();
            }
            pq.poll();
           
            while(head!=null)
            {
                pq.add(head);
                head=head.next;
            }
        }
        last.next=null;
        return newnode;
    
    }
    public static void main(String[] args) {
        
    }
    
}
