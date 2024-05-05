//Remove the duplicate charaters from the give string
//Google and Microsoft

import java.util.*;
public class RecursionRemoveDuplicate{
  public static void Remove(String str,int index,StringBuilder newstr,boolean map[]){
    if(index==str.length()){
      System.out.print(newstr);
      return;
    }

    char currChar=str.charAt(index);
    if (map[currChar-'a']==true){
      Remove(str,index+1,newstr,map);
    }
    else {
      map[currChar-'a']=true;
      Remove(str,index+1,newstr.append(currChar),map);
    }


  }
  public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    String str="annujjjjjjjkkausshal";
    Remove(str,0,new StringBuilder(""),new boolean [26]);
  }  
}
