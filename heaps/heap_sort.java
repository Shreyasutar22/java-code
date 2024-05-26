public class heap_sort {

    static void sort(int[] arr, int n)
    {
        for(int i=n/2-1; i>=0; i--)
        {
            heapify(arr, n, i);
        }


        for(int i=n-1; i>0; i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, 0);
        }
    }
    static void heapify(int [] arr, int n , int i)
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
            heapify(arr, n, i);
        }
    }

    static void print_array(int[]arr)
    {
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 7, 6, 0, 9 };
        
        int n= arr.length;
        heap_sort.sort(arr, n);
        heap_sort.print_array(arr);
       
    }
    
}
