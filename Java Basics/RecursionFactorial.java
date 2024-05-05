import java.util.*;
public class RecursionFactorial{

  public static int factorial(int n){
    if (n==0){
      return 1;
    }
    int factorial=n*factorial(n-1);
    return factorial;
  }

  public static void main (String args []){
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter the number you want to find the factorial of : ");
    int n=sc.nextInt();
    System.out.println(factorial(n));

  }  
}
