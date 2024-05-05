//A small edited question of fractional knapsack where you have to reach the target sum using the arr of numbers given

import java.util.*;

public class TargetSum{

    public static boolean targetSumSubset(int arr[],int sum){
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<n+1;i++){              //i is the number of elements that are taken in considereation and j is the sum tha is to be achieved where dp array will the store true or false weather the target j can be achieved or not by the i items
            for(int j=1;j<sum+1;j++){
                //include
                int v=arr[i-1];
                if(v<=j && dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                //exclude
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={4,2,7,1,3};
        System.out.print("Enter the required sum : ");
        int sum=sc.nextInt();
        System.out.print(targetSumSubset(arr,sum));

    }
}