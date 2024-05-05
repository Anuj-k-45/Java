//To Convert a Number from Binomial to Decimal

import java.util.*;
public class BinaryToDecimal {
   
   public static void main (String args[]) {
   Scanner sc=new Scanner (System.in);
   System.out.print("Entre the binnary number : ");
   int binary=sc.nextInt();
   int decimal=0;
   for(int power=0;binary>0;power++) {
    int lastDigit= binary%10;
    decimal=decimal+(lastDigit * (int)Math.pow(2, power));
    binary=(int)binary/10;
    
   }
    System.out.println("The number in Decimal form is : "+decimal);
  }
}