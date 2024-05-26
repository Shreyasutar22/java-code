package Binary_tree_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class pair{
    int first;
    int sec;

    pair(int first, int sec)
    {
        this.first=first;
        this.sec=sec;
    }
}

public class bt_bst_min_swap {

    void inroder(int ar[], ArrayList<Integer>ob, int n, int i)
    {
        if(i>=n)
        return;
        inroder(ar,ob,n, 2*i+1);
        ob.add(ar[i]);
        inroder(ar, ob, n, 2*i+2);


    }
    
    int min_val(ArrayList<Integer> ob)
    {
        ArrayList<pair>arrpos= new ArrayList<>();
        for (int i = 0; i < ob.size(); i++) {
            arrpos.add(new pair(ob.get(i), i));
            
        }
        


        
        arrpos.sort(new Comparator<pair>() {
            public int compare(pair o1, pair o2)
            {
                return o1.first-o2.first;
            }
            
        });
        int n=arrpos.size();
        

        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);
  
        
        int ans = 0;
  
       
        for (int i = 0; i < n; i++)
        {
            
            if (vis[i] || arrpos.get(i).first == i)
                continue;
  
            
            int cycle_size = 0;
            int j = i;
            while (!vis[j])
            {
                vis[j] = true;
  
                // move to next node
                j = arrpos.get(j).sec;
                cycle_size++;
            }
  
            // Update answer by adding current cycle.
            if(cycle_size > 0)
            {
                ans += (cycle_size - 1);
            }
        }
        return ans;
   
            
        }
        
        
       
        

/*
 *  int swap=0;

         {
            if(i==arrpos.get(i).sec){
                continue;
            }else{
                ++swap;
                
                bt_bst_min_swap ob2= new bt_bst_min_swap();
                ob2.swap(arrpos.get(i), arrpos.get(arrpos.get(i).sec));
               --i;

            }
            
        }
        return swap;
 *
 */


        

    

    public static void main(String[] args) {
        int a[] = { 5, 6, 7, 8, 9, 10, 11 };
        int n = a.length;
        ArrayList<Integer>ob= new ArrayList<>();
        bt_bst_min_swap ob1= new bt_bst_min_swap();
        ob1.inroder(a, ob, n, 0);
        System.out.println(ob1.min_val(ob));

    }
    
}
