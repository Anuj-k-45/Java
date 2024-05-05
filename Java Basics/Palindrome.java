//Identify if a word is a palindrome : example? NOON, RACECAR
import java.util.*;
public class Palindrome{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your word : ");
    String n=sc.nextLine();
    boolean isPalindrome=true;

    for (int i=0;i<=(n.length()-1)/2;i++){
      if (n.charAt(i)!=n.charAt((n.length()-1)-i)){
        isPalindrome=false;
        break;
      }
    }
    System.out.print("Is a Palindrome? : "+isPalindrome);



  }
}
  
 