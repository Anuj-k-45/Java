import java.util.*;
public class RecursionSumOfNatural{

  public static int Sum(int n){
    if (n==1){
      return 1;
    }
    int Sum=n + Sum(n-1);
    return Sum;
  }

  public static void main (String args []){
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter the numbers upto which you need the sum : ");
    int n=sc.nextInt();
    System.out.println(Sum(n));
  }  
}
