package Binary_tree_program;

import java.util.Stack;

public class tree_string_parent {
    
    int find_index(String s, int si, int ei)
    {
        if(si>ei)
        {
            return -1;
        }
        Stack<Character>ob= new Stack<>();
        for(int i=si; i<=ei; i++)
        {
            if(s.charAt(si)=='(')
        {
            ob.add(s.charAt(i));

        }
        else if(s.charAt(i)==')')
        {
            if(ob.peek()=='(')
            {
                ob.pop();
                if(ob.isEmpty())
                {
                    return i;

                }
            }
        }
        
    }

    return -1;


        
    }

    Node find_root(String s, int si, int ei)
    {
        if(si>ei)
        {
            return null;
        }
        si--;
        int num=s.charAt(si);
        Node root= new Node(num);
        
        int index=-1;
        if(si+1<=ei && s.charAt(si+1)=='(')
        {
            index=find_index(s, si+1, ei);
        }
        if(index!=-1)
        {
            root.left=find_root(s, si+2, index-1);
            root.right=find_root(s, index+2, ei-1);
        }



        return root; 


         
        
        
    }
     void preOrder(Node node)
  {
    if (node == null)
      return;
    System.out.printf("%d ", node.data);
    preOrder(node.left);
    preOrder(node.right);
  }



    
    public static void main(String[] args) {
        String str = "4(2(3)(1))(6(5))";
        tree_string_parent ob2= new tree_string_parent();
        Node root=ob2.find_root(str, 0, str.length()-1);
        ob2.preOrder(root);

        
    }
}
