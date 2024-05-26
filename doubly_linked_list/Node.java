package doubly_linked_list;

public class Node {
    Node prev;
    Node next;
    int data;

    Node(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;

    }
    
}
