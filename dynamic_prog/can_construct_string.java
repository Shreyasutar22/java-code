package dynamic_prog;

import java.util.HashMap;

public class can_construct_string {

    HashMap<String, Boolean>ob= new HashMap<>();

boolean  can_cons(String s, String ar[])
{
    if(ob.containsKey(s))
    {
        return ob.get(s);
    }
    if(s=="")
    {
        return true;
    }
   for (int i = 0; i < ar.length; i++) {
    if(s.indexOf(ar[i])==0)
    {
        String suffix=s.substring(ar[i].length());
        if(can_cons(suffix, ar)==true)
        {
            ob.put(s, true);
            return true;
        }
    }
   }
   ob.put(s, false);
   return false;
}
    public static void main(String[] args) {
        String s="eeeeeeeeeeeeeeeeeeeeeedeeeeeeeeeeeeeef";
        String ar[]={"e","ee","eee","eeee","eeeee","eeeeee"};
        can_construct_string t= new can_construct_string();
        System.out.println(t.can_cons(s, ar)); 
    }
    
}
