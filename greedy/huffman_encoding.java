package greedy;
import java.util.*;;

class Node{
    int data;
    char c;
    Node left;
    Node right;
    
}

public class huffman_encoding {

    public static void main(String[] args) {
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };


        PriorityQueue<Node> q= new PriorityQueue<Node>(n, new MyComparator());
        
        for (int i = 0; i < charfreq.length; i++) {
            Node a= new Node();
            a.c=charArray[i];
            a.data=charfreq[i];
            q.add(a);
        }

        Node root=null;

        while (q.size()>1) {
            Node x=q.remove();
            Node y=q.remove();
            Node f= new Node();
            f.data=x.data+y.data;
            f.c='-';
            f.left=x;
            f.right=y;
            root=f;
            q.add(f);

        }
        print_code(root, "");
    }

    public static void print_code(Node root, String s)
{
    if (root.left == null && root.right == null
            && Character.isLetter(root.c)) {
 
            // c is the character in the node
            System.out.println(root.c + ":" + s);
 
            return;
        }

        print_code(root.left, s + "0");
        print_code(root.right, s + "1");
    
}

    

   
} 
class MyComparator implements Comparator<Node>
{
    public int compare(Node x, Node y)
    {
 
        return x.data - y.data;
    }

}


