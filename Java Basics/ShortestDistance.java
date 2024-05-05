import java.util.*;
public class ShortestDistance{
  public static void main (String args[]){
    String loc="WNEENESENNN";
    int x=0;
    int y=0;
    for (int i=0;i<loc.length();i++){
      char move=loc.charAt(i);
      if (move=='E'){
        x=x+1;
      }
      else if (move=='W'){
        x=x-1;
      }
      else if (move=='N'){
        y=y+1;
      }
      else if (move=='S'){
        y=y-1;
      }
    }
    System.out.print("The shortest distance is : " + Math.sqrt((x*x)+(y*y)));
  }
}
  
 