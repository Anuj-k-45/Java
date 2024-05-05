//Job sequencing problem using greedy approch

import java.util.*;
public class JobSequencing{

    public static void jobsequence(int job[][]){
        int n=job.length;

        int table[][]=new int[n][3];
        for(int i=0;i<n;i++){
            table[i][0]=i;
            table[i][1]=job[i][0];
            table[i][2]=job[i][1];
        }
        Arrays.sort(table,Comparator.comparingDouble(a->a[2]));
        int totalJobsDone=0;
        int currentDate=0;
        int profit=0;

        System.out.print("The jobs that can done are : ");
        for(int i=table.length-1;i>=0;i--){
            if(table[i][1]>currentDate){
                currentDate++;
                totalJobsDone++;
                profit=profit+table[i][2];
                System.out.print(i+" ");
            }
        }
        System.out.println("The total jobs done are : " + totalJobsDone);
        System.out.println("The total profit gained is : " + profit);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int job[][]={{4,20},{1,10},{1,40},{1,30}};
        jobsequence(job);
    }
}