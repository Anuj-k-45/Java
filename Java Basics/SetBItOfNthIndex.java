import java.util.*;
public class SetBItOfNthIndex{
  public static void main (String args []){
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter your number you want to set the bit of : ");
    int num=sc.nextInt();
    System.out.print("Enter the index : ");
    int index= sc.nextInt();

    num = num | (1<<index);

    System.out.println(num);
  }  
}
