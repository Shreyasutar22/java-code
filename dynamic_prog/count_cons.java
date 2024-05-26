package dynamic_prog;

import java.util.HashMap;

public class count_cons {
    HashMap<String , Integer> map= new HashMap<>();

    int count_cons(String s, String[] ar)
    {
        if(map.containsKey(s))
        {
            return map.get(s);
        }
        int res=0;
        if(s=="")
        {
            return 1;
        }
        else{
            for(int i=0; i<ar.length; i++)
            {
                if(s.indexOf(ar[i])==0)
                {
                    res+=count_cons(s.substring(ar[i].length()), ar);
                }
            }
        }
        map.put(s, res);
        return res;
    }

    public static void main(String[] args) {
        String s="purple";
        String ar[]={"pur","le","p","ur","purp"};
        count_cons x= new count_cons();
        System.out.println(x.count_cons(s, ar));
    }
    
}
