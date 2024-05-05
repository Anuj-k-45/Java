//To check whether a given number is Prime or not

import java.util.*;
public class CheckPrime{
   public static boolean isPrime(int n) {
    boolean isPrime = true;
    for(int i=2; i<=Math.sqrt(n);i++) {
      if (n%i==0){
        isPrime=false;
      }
    }
    return isPrime;
   }
   public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Entre the number to check : ");
    int a=sc.nextInt();
    System.out.println("The given number is Prime : " + isPrime(a));
  }
}