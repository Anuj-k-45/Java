//Fibonacci number using Dynamic programming

import java.util.*;
public class FibonacciNumber{

    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        int fib=fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }

    public static int fibMemoization(int n){
        int arr[]=new int[n+1];
        
        if(n==1 || n==0){
            return n;
        }

        else if(arr[n]!=0){
            return arr[n];
        }

        arr[n]=fibMemoization(n-1)+fibMemoization(n-2);
        return arr[n];
    }

    public static int fibTabulation(int n){
        
        if(n==1 || n==0){
            return n;
        }
        
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index of required fibonacci number : ");
        int n=sc.nextInt();
        // System.out.println(fibonacci(n));
        // System.out.println(fibMemoization(n));
        System.out.println(fibTabulation(n));
    }
}