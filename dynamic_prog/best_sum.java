package dynamic_prog;

import java.util.ArrayList;
import java.util.HashMap;

public class best_sum {

    ArrayList<ArrayList<Integer>> ob1= new ArrayList<>();
    HashMap<Integer,ArrayList<Integer>>ob3= new HashMap<>();


    ArrayList<Integer>find_sum(int a, int ar[])
    {
        if(ob3.containsKey(a))
        return ob3.get(a);

        if(a==0)
        {
            return (new ArrayList<>());
        }
        if(a<0)
        {
            return null;

        }
        ArrayList<Integer> shortest=null;
        for (int i = 0; i < ar.length; i++) {
            int rem=a-ar[i];
            ArrayList<Integer>rem_combi= find_sum(rem, ar);
            if(rem_combi!=null)
            {
                ArrayList<Integer>curr_list= new ArrayList<>();
                
                int k=0;
                while(k<rem_combi.size())
                {
                    curr_list.add(rem_combi.get(k));
                 
                    k++;
                }
                curr_list.add(ar[i]);
                if(shortest==null||curr_list.size()<shortest.size())
                {
                    
                    shortest=curr_list;
                    
                }
            }
            
        
        }
        ob3.put(a, shortest);
        return shortest;
        
    }

    public static void main(String[] args) {

        int[] ar={1,2,5,25};
        int a=100;
        best_sum t= new best_sum();
        System.out.println(t.find_sum(a, ar)); 
        
    }
    
}
