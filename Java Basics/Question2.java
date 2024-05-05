import java.util.*;
public class Question2{
  public static void main (String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter your number : ");
     int num=sc.nextInt();
     if (num%10==9){
      System.out.println(((int)num/10)+1);
     }
     else{
     System.out.print((int)num/10);
     }
  }
}
