import java.util.*;
public class BitwiseOddEven{
  public static void main (String args []){
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter your number to check odd or even : ");
    int num=sc.nextInt();
    
    if ((num & 1) == 1){
      System.out.println("The given number is odd!");
    }
    else{
      System.out.println("The given number is even!");
    }
  }  
}
