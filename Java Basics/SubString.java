import java.util.*;
public class SubString{
  public static String subString(String str,int startIndex,int endIndex){
    String subString="";
    for (int i=startIndex;i<endIndex;i++){
      subString=subString+str.charAt(i);
    }
    return subString;
  }
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    String str= "HelloWorld";
    System.out.print("Enter your starting Index : ");
    int startIndex=sc.nextInt();
    System.out.print("Enter your ending Index : ");
    int endIndex=sc.nextInt();
    System.out.println(subString(str,startIndex,endIndex));

  }
}