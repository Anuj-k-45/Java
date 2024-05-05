//Minimum Absolute difference using greedy approch

import java.util.*;
public class MinimumAbsoluteDifference{

    public static int minAbsoluteDifference(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum=sum+Math.abs(arr1[i]-arr2[i]);
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr1[]={1,3,2};
        int arr2[]={3,2,1};
        System.out.println("The minimum absolute difference is : " + minAbsoluteDifference(arr1, arr2));
    }
}