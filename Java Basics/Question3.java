import java.util.*;
public class Question3{
  public static void main (String args[]){
     Scanner sc=new Scanner(System.in);
     String cards=sc.nextLine();
     if (cards.equals("bca") || cards.equals("cab")) {
      System.out.println("NO!!");
     }
     else {
      System.out.println("YES!!");
     }
  }
}
