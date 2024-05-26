/**
 * max_heapify
 */
public class max_heapify {

    static void heapify(int[] arr, int n, int i)
    {
        int l=2*i+1;
        int r=2*i+2;
        int largest=i;

        if(l<n && arr[l]>arr[largest])
        {
            largest=l;
        }
        if(r<n && arr[r]>arr[largest])
        {
            largest=r;
        }
        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr, n, largest);
        }
    }

    static void buildHeap(int[] arr, int n)
    {
        int start=(n/2)-1;
        for(int i=start; i>=0; i--)
        {
            heapify(arr, n , i);
        }
    }
    static void printheap(int[] arr, int n)
    {
        System.out.println("heapifyed array is");
        for(int i=0; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int N = arr.length;
       
        buildHeap(arr, N);
        printheap(arr, N);
    }
}