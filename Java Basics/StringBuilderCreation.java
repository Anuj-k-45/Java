import java.util.*;
public class StringBuilderCreation{
  public static void main (String args[]){
    StringBuilder a=new StringBuilder("");
    for(char ch='a';ch<='z';ch++){
      a.append(ch);
    }
    System.out.print(a);
  }
}