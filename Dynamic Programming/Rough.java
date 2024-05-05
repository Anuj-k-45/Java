import java.util.*;

public class Rough{
    
    public static int unboundedknapSackTabulation(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<=W;j++){
                int v=val[i-1];     //weight of ith item
                int w=wt[i-1];      //value of ith item

                if(w<=j){
                    int includeProfit=v+dp[i][j-w];
                    int excludeProfit=dp[i-1][j];
                    dp[i][j]=Math.max(includeProfit, excludeProfit);
                }
                else{
                    int excludeProfit=dp[i-1][j];
                    dp[i][j]=excludeProfit;
                }
            }
        }
        return dp[n][W];
    }
    
    public static void main(String args[]){
        int val[]={15,14,10,45,30,};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){                //here i is the number of elements from which you have to select and j is the weight that is to be reached whereas the dp table will consist of the max value that can be achieved with i items to reach W weight
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.print("The max value obtained is : " + unboundedknapSackTabulation(val, wt, W));
    }
}