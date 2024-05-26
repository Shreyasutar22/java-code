package dynamic_prog;
import java.util.*;
public class can_sum {

    HashMap<Integer, Integer> ob= new HashMap<Integer, Integer>();


    boolean find_sum(int sum, int arr[])
    {
        if(sum==0)
        {
            return true;
        }
        if(sum<0)
        return false;
        for (int i = 0; i < arr.length; i++) {
            int rem=sum-arr[i];
            if(find_sum(rem, arr)==true)
            {
                return true;
            }
        }
        return false;
       
    }
    

}
