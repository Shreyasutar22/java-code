package graphs;

public class sentence_from_words {

    static  int c=3;
    static   int r=3;

    static void print_util(String arr[][], int m, int n, String output[])
    {
        output[m]=arr[m][n];

        if(m==r-1)
        {
            for (int i = 0; i < r; i++) {
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }
        

            for (int i = 0; i < c; i++) {
                if( arr[m+1][i]!=""&& m<c){
                    print_util(arr, m+1, i, output);
                }
                
            }



        
    }
    
    
    
    
    
    
    static void print(String arr[][])
    {
        String output[]= new String[r];

        for(int i=0; i<c; i++)
        {
            if(arr[0][i]!="")
            {
                print_util(arr,0, i, output);

            }
           

        }

    }
    
    
    public static void main(String[] args) {
     
        String Input[][]= {{"you", "we",""},
        {"have", "are",""},
        {"sleep", "eat", "drink"}};

        print(Input);


        
    }
    
}
