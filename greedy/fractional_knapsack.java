package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class fractional_knapsack {



   static double getMaxValue(ItemValue arr[], int capacity)
    {
       
        Arrays.sort(arr, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue v1, ItemValue v2)
            {
                double cpr1=(double)(v1.profit/v1.weight);
                double cpr2=(double)(v2.profit/v2.weight);
                if(cpr1<cpr2)
                {
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        double totalvalue=0d;
        for(ItemValue i: arr)
        {
            int curr_wt=(int)i.weight;
            int curr_val=(int)i.profit;
            if(capacity-curr_wt>=0)
            {
                totalvalue+=curr_val;
                capacity=capacity-curr_wt;
            }else{
                double fraq=((double)capacity/(double)curr_wt);
            totalvalue+=curr_val*fraq;
            capacity=(int)(capacity-(curr_wt*fraq));
            break;
        }
    }
    return totalvalue;

}
    public static void main(String[] args) {
        ItemValue[] arr = { new ItemValue(60, 10),
            new ItemValue(100, 20),
            new ItemValue(120, 30) };

int capacity = 50;

double maxValue = getMaxValue(arr, capacity);

// Function call
System.out.println(maxValue);
        
    }
    
}
 class ItemValue {
 
    int profit, weight;

    // Item value function
    public ItemValue(int val, int wt)
    {
        this.weight = wt;
        this.profit = val;
    }
}
