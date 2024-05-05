//Tilling Problem
/*Given a "2 * n" board and tiles sizes "2 * 1", count the number 
of ways to tile the given board using the "2 * 1" tiles*/ //Amazon Interview

import java.util.*;
public class RecursionTilingProblem{

  public static int tiles(int n){
    if (n==0 || n==1){
      return 1;
    }
    int total=tiles(n-1)+tiles(n-2);
    return total;
  }



  public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    System.out.println("The length of the board is 2");
    System.out.print("Enter the width of the board : ");
    int n=sc.nextInt();
    System.out.println("The total number of ways the board can be covered by tiles is : " + tiles(n));
  }  
}
