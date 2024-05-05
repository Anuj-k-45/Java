//To Convert Decimal Number to binary

import java.util.*;
public class DecimalToBinary{
  public static void main (String args[]) {
   Scanner sc=new Scanner (System.in);
   System.out.print("Entre the Decimal Number : ");
   int decimal=sc.nextInt();
   int binary=0;
   for (int power=0;decimal>0;power++) {
    binary=binary+(int)((decimal%2)*Math.pow(10, power));
    decimal=(int)decimal/2;
   }
   System.out.println("The number in binary form is : " + binary);
  }
}