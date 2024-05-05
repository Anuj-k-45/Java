import java.util.*;
public class GetNthBIt{
  public static void main (String args []){
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter your number you want to the bit of : ");
    int num=sc.nextInt();
    System.out.print("Enter the index you want to check : ");
    int index= sc.nextInt();

    if ((num & (1<<index)) == 0){
      System.out.println("The index is 0");
    }
    else {
      System.out.println("The index is 1");
    }
  }  
}
