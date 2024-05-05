import java.util.*;
public class RecursionNthFibonacciNumber{
  public static int fib(int n){
    if (n==0 || n==1){
      return n;
    }
    int fibn=fib(n-1)+ fib(n-2);
    return fibn;
  }
  public static void main (String args []){
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter which fibonacci number you want to see : ");
    int n=sc.nextInt();
    
    System.out.println(fib(n));
  }  
}
