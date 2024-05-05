//Count the total number of nQueen solutions and print the solution of all the cases

import java.util.*;
public class BacktrackNqueenProblem{
    public static void nQueens(char chess[][],int row){
        //base case
        if(row==chess.length){
            print(chess);
            count++;
            return;
        }
        //recursion call
        for(int i=0;i<chess.length;i++){
            if(checkSafe(chess,row,i)){
                chess[row][i]='Q';
                nQueens(chess,row+1);
                chess[row][i]='x';
            }
        }
    }


    public static void print(char chess[][]){
        System.out.println("-----Chess Board-----");
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                System.out.print(chess[i][j] + "   ");
            }
            System.out.println();
            System.out.println();
        }
    }


    public static boolean checkSafe(char chess[][],int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }


    static int count=0;


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of 'n' in n*n chess board : ");
        int n=sc.nextInt();
        char chess[][]=new char[n][n];
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                chess[i][j]='x';
            }
        }
        nQueens(chess,0);
        System.out.print("The total number of safe cases is : " + count);
    }
}