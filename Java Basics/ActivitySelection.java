//Activity selection using greedy approch

import java.util.*;
public class ActivitySelection{

    // public static void activitySelection(int start[],int end[]){       //O(n^2)
    //     int n=start.length;
    //     int maxact=0;
    //     int currStart=start[0];
    //     int currEnd=end[0];
    //     for(int i=0;i<n-1;i++){
    //         int num=1;
    //         for(int j=i+1;j<n;j++){
    //             if(currEnd<=start[j]){
    //                 currStart=start[j];
    //                 currEnd=end[j];
    //                 num++;
    //             }
    //         }
    //         if(maxact<num){
    //             maxact=num;
    //         }
    //     }
    //     System.out.println(maxact);
    // }

    // public static void activitySelection(int start[],int end[]){      //O[n] considering that the ending time all all the activities is sorted
    //     int maxact=0;
    //     ArrayList<Integer> ans=new ArrayList<>();

    //     //as ending time of the activities are sorted, the first activity will take the least time and thereby becompleted first
    //     ans.add(0);
    //     maxact=1;
    //     int lastEnd=end[0];
    //     for(int i=1;i<end.length;i++){
    //         if(start[i]>=lastEnd){
    //             maxact++;
    //             ans.add(i);
    //             lastEnd=end[i];
    //         }
    //     }
    //     System.out.println("Maximum Activities : " + maxact);
    //     for(int i=0;i<ans.size();i++){
    //         System.out.print("A"+ans.get(i)+" ");
    //     }
    //     System.out.println();
    // }

    public static void activitySelection(int start[],int end[]){      //O[n] considering that the ending time all all the activities is unsorted
        int maxact=0;
        ArrayList<Integer> ans=new ArrayList<>();
        int  activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(a->a[2]));

        //as ending time of the activities are sorted, the first activity will take the least time and thereby becompleted first
        ans.add(activities[0][0]);
        maxact=1;
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxact++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Maximum Activities : " + maxact);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};
        activitySelection(start,end);
    }
}