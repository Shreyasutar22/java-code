package dynamic_prog;

import java.util.HashMap;

public class grid_traveller {

    HashMap<String, Long> ob= new HashMap<String, Long>();


    long  best_way(int m, int n)
    {
        String s= m+","+n;
        if(ob.containsKey(s))
        {
            return ob.get(s);
        }
        if(m==1 || n==1)
        {
            return 1;
        }
        if(n==0|| m==0)
        {
            return 0;
        }

        long val=best_way(m-1, n)+best_way(m, n-1);
        ob.put(s, val);
        return ob.get(s);
    }

    public static void main(String[] args) {
        grid_traveller ob1= new grid_traveller();
        
        System.out.println(ob1.best_way(18, 18));
    }
    
}
