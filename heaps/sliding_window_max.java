import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class sliding_window_max {


    static ArrayList<Integer> find_ele(int[]arr, int k)
    {
        PriorityQueue<data>heap=new PriorityQueue<>((a, b)->{
            return b.d-a.d;
        });
        ArrayList<Integer>ans= new ArrayList<>();
        for(int i=0; i<k; i++)
        {
            heap.offer(new data(arr[i], i));
        }
        ans.add(heap.peek().d);
        for(int i=k; i<arr.length; i++)
        {
            heap.offer(new data(arr[i], i));
            while(heap.peek().index<=i-k)
            {
                heap.poll();
            }
            ans.add(heap.peek().d);
        }
        return ans;


    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int K = 3;
        ArrayList<Integer>ob=sliding_window_max.find_ele(arr, K);
        for(int e: ob)
        {
            System.out.println(e+" ");
        }
    }
    
}

class data{
    int d, index;
    data(int d, int index)
    {
        this.d=d;
        this.index=index;
    }
}
