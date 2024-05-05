/*Given n friends, each one can remain single or can be paired up with some 
other friend. Each friend can be paired only once. Find out the total number
of ways in which friends can remain single or can be paired up*/
//Goldman Sachs

import java.util.*;
public class RecursionPairingProblem{
  public static void binaryString(int n,int lastDig,String str){
    if (n==0){
      System.out.println(str);
      return;
    }
    binaryString(n-1, 0, str+"0");

    if (lastDig==0){
      binaryString(n-1, 1, str+"1");
    }
  }

  public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total number of people : ");
    int n=sc.nextInt();
    binaryString(n, 0, "");
  }  
}
