//1st prefrence is to dictionary and then the length 

import java.util.*;
public class CompareStrings{
  public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    String names[]={"apple","Apple3","z"};
    String largest=names[0];
    for(int i=1;i<3;i++){
      if(names[i].compareTo(largest)>0){ //Use str1.compairToignorecase(str2) to ignore cases
        largest=names[i];
      }
    }
    System.out.println("The Largest Fruit is "+largest);
  }
}
