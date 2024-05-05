//Climbing stairs problem. Count number of ways required for a person to climb n stairs if he can climb 1 or 2 at a time

import java.util.*;

public class ClimbStairs {

    public static int climbStairsRecursion(int n){
        if(n==0 || n==1 || n==2){
            return n;
        }
        int ways=climbStairsRecursion(n-1)+climbStairsRecursion(n-2);
        return ways;
    }

//-------------------------------------------------------------------------------------------------------------------

    public static int climbStairsMemoization(int n){
        int arr[]=new int[n+1];

        if(n==0 || n==1 || n==2){
            return n;
        }
        
        else if(arr[n]!=0){
            return arr[n];
        }
        arr[n]=climbStairsMemoization(n-1)+climbStairsMemoization(n-2);
        return arr[n];
    }

//-------------------------------------------------------------------------------------------------------------------

    public static int climbStairsTabulation(int n){

        if(n==0 || n==1 || n==2){
            return n;
        }
        
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        return arr[n];
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of stairs : ");
        int n=sc.nextInt();
        // System.out.print("Total ways to climb " + n + " stairs are : " + climbStairsRecursion(n));
        // System.out.print("Total ways to climb " + n + " stairs are : " + climbStairsMemoization(n));
        System.out.print("Total ways to climb " + n + " stairs are : " + climbStairsTabulation(n));
    }
}
