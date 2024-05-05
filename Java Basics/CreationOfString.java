import java.util.*;
public class CreationOfString{
  public static void print(String full){
    for (int i=0;i<full.length();i++){
      System.out.print(full.charAt(i) + " ");
    }
  }
  public static void main (String args[]){
    String a="abcd";
    Scanner sc=new Scanner (System.in);
    //System.out.println(a.length());
    //String name=sc.nextLine();
    String name1="Anshi";
    String lastname="Singh";
    String full=name1 + " " + lastname;
    System.out.println(full.length());
    System.out.println(full.charAt(6));
    print(full);


    //System.out.println(full + "The length of the string is : " + full.length());
  }
}
  
 