//Convert the first letter of each word in the String to upper case (Question asked in Interview)

import java.util.*;
public class ConvertToUpperCase{
  public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    StringBuilder sb=new StringBuilder("");
    System.out.println("Enter your string : ");
    String a=sc.nextLine();
    
    sb.append(Character.toUpperCase(a.charAt(0)));

    for (int i=1;i<a.length();i++){
      if (a.charAt(i)==' '){
        sb.append(a.charAt(i));
        i++;
        sb.append( Character.toUpperCase(a.charAt(i)));
      }
      else {
        sb.append(a.charAt(i));
      }
    }
    sb.toString();
    System.out.println(sb);
  }
}
