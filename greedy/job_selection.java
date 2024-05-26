package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Activity{
    int first;
    int sec;

    Activity(int a, int b)
    {
        this.first=a;
        this.sec=b;

    }
}



public class job_selection {
    static int count=1;

    void find_jobs(Activity[] arr)
    {
        Arrays.sort(arr,new Comparator<Activity>() {

                    public int compare(Activity s1, Activity s2)
                    {
                        return s1.sec-s2.sec;
                    }
            
        });
         
    }

    void sort_array(Activity[] act)
    {
        job_selection ob= new job_selection();
        ob.find_jobs(act);
        
        int i=0;
        for(int j=1; j<6; j++)
        {
            if(act[j].first>=act[i].sec)
            {
                System.out.println("("+act[j].first+","+act[j].sec+")");
                count+=1;
                i=j;
            }
        }
        System.out.println(count);


    }

    public static void main(String[] args) {
        Activity arr[]= new Activity[6];
        arr[0] = new Activity(5, 9);
        arr[1] = new Activity(1, 2);
        arr[2] = new Activity(3, 4);
        arr[3] = new Activity(0, 6);
        arr[4] = new Activity(5, 7);
        arr[5] = new Activity(8, 9);
        job_selection ob= new job_selection();
        ob.sort_array(arr);
        
    }

    
}