package Binary_tree_program;

import java.util.ArrayList;
import java.util.HashMap;

public class how_sum {

    //memoization 
    static ArrayList<ArrayList<Integer>>ob1= new ArrayList<ArrayList<Integer>>();
    static HashMap<Integer, ArrayList<Integer>>ob3= new HashMap<>();


    static ArrayList<Integer> find_sum(int a, int[] ar)
    {
        if(ob3.containsKey(a))
        return ob3.get(a);
        if(a==0)
        return (new ArrayList<>());
        if(a<0)
        return null;

        for (int i = 0; i < ar.length; i++) {
            int rem=a-ar[i];
            ArrayList<Integer> ob2= find_sum(rem, ar);
            if(ob2!=null)
            {
                ob2.add(ar[i]);
                ob1.add(ob2);
                ob3.put(a, ob2);
                return ob3.get(a);
            }
        }
        ob3.put(a,null);
        return null;


    }
 

    public static void main(String[] args) {
        int a[]={7,14};
        bst.find_sum(300,a);
      
            if(ob1.isEmpty())
            System.out.println("null");
            else{
                System.out.println(ob1.get(0));
            } 

    }

    
}