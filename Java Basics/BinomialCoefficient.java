//To find Binomial Coefficient (nCr)

import java.util.*;
public class BinomialCoefficient{
  public static int f(int a) {
    int fact=1;
    for (int i=1;i<=a;i++) {
      fact=fact*i;
    }
    return fact;
  }

  public static void main (String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Start entering : ");
    int n= sc.nextInt();
    System.out.print(" C ");
    int r= sc.nextInt();
    int binomialCoefficient= f(n)/(f(r)*f(n-r));
    System.out.println("The answer is : " + binomialCoefficient);
  }
}