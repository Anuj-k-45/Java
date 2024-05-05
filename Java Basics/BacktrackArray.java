import java.util.*;
public class BacktrackArray{

    public static void print(int num[]){
        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i] + " ");
        }
        System.err.println();
    }

    public static void backtrack(int num[],int val,int pos){
        
        if(pos>=num.length){
            print(num);
            return;
        }

        num[pos]=val;
        backtrack(num, val+1, pos+1);
        num[pos]=num[pos]-2;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms in the array : ");
        int n=sc.nextInt();
        int num[]=new int[n];

        backtrack(num,1,0);

        print(num);
    }
}