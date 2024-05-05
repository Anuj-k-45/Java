import java.util.*;
public class SumOfDigits{
  public static int lastD(int number) {
    return number%10;
  }
  public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Entre your Number : ");
    int num=sc.nextInt();
    int sum=0;
    for(int i=0;(num*10)/10>0;i++) {
      sum=sum+lastD(num);
      num=(int)num/10;
    }
    System.out.print("The sum of the Digits is : "+sum);

  }
} 