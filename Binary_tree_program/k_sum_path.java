package Binary_tree_program;

import java.util.ArrayList;

public class k_sum_path {
    ArrayList<Integer>list= new ArrayList<>();

    void print_path(Node root, int k)
    {
        if(root==null)
        {
            return ;
        }
        list.add(root.data);
        print_path(root.left, k);
        print_path(root.right, k);

        int f=0;
        for (int j =list.size()-1; j>=0; j--) {
            f+=list.get(j);

            if(f==k)
            {
                print_list(list, j);
            }
        }
        list.remove(list.size()-1);


    }

    void print_list(ArrayList<Integer>list1, int k)
    {
        for(int i=k; i<list1.size(); i++)
        {
            System.out.print(list1.get(i)+" ");

        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right = new Node(-1);
        root.right.left = new Node(4);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(2);
        int k=5;
        k_sum_path ob1= new k_sum_path();
        ob1.print_path(root, k);

    }
    
}
