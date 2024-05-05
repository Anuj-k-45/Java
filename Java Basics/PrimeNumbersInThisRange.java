//To find Prime numbers in a given range

import java.util.*;
public class PrimeNumbersInThisRange{
   public static boolean isPrime(int n) {
    boolean isPrime= true;
    for(int i=2; i<=Math.sqrt(n);i++) {
      if (n%i==0){
        isPrime=false;
      }
    }
    return isPrime;
   }
   public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Entre the starting number : ");
    int a=sc.nextInt();
    System.out.print("Entre the last number : ");
    int b=sc.nextInt();
    for (int i=a;i<=b;i++) {
    boolean ans=isPrime(i);
    if (ans==true) {
        System.out.print(i+ " ,");
    }
    };
  }
}