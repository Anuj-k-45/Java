import java.util.*;

public class Zero_One_KnapSack{

    public static int knapSackRecursion(int val[],int wt[],int W,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=W){      //valid
            //include
            int ans1=val[n-1]+knapSackRecursion(val, wt, W-wt[n-1], n-1);
            //exclude
            int ans2=knapSackRecursion(val, wt, W, n-1);

            return Math.max(ans1, ans2);
        }
        else{
            return knapSackRecursion(val, wt, W, n-1);
        }
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    public static int knapSackMemoization(int val[],int wt[],int W,int n,int dp[][]){
        if(W==0 || n==0){
            return 0;
        }

        if(dp[n][W]!=-1){
            return dp[n][W];
        }

        if(wt[n-1]<=W){      //valid
            //include
            int ans1=val[n-1]+knapSackMemoization(val, wt, W-wt[n-1], n-1,dp);
            //exclude
            int ans2=knapSackMemoization(val, wt, W, n-1,dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }

        else{
            dp[n][W] = knapSackMemoization(val, wt, W, n-1,dp);
            return dp[n][W];
        }
    }

//-------------------------------------------------------------------------------------------------------------------------------------------

    public static int knapSackTabulation(int val[],int wt[],int W){
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
                    int includeProfit=v+dp[i-1][j-w];
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












//-------------------------------------------------------------------------------------------------------------------------------------------


    public static void main(String args[]){
        int val[]={15,14,10,45,30,};
        int wt[]={2,5,1,3,4};
        int W=7;
        // System.out.print("The max value obtained is : " + knapSackRecursion(val, wt, W, wt.length));
        int dp[][]=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){                //here i is the number of elements from which you have to select and j is the weight that is to be reached whereas the dp table will consist of the max value that can be achieved with i items to reach W weight
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        // System.out.print("The max value obtained is : " + knapSackMemoization(val, wt, W, wt.length,dp));
        System.out.print("The max value obtained is : " + knapSackTabulation(val, wt, W));
    }
}
