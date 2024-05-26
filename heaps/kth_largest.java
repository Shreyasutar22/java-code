import java.util.PriorityQueue;

public class kth_largest {
    static void print_largest(int[] arr, int k)
    {
        PriorityQueue<Integer>pq= new PriorityQueue<>((a, b)->(b-a));
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            pq.offer(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        System.out.println(pq.peek());
        
    }
    public static void main(String[] args) {
        int N = 10;
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int k = 4;
        System.out.println("1");
        kth_largest.print_largest(arr, k);
 
    }
    
}
