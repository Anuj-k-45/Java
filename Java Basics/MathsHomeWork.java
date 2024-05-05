
import java.util.*;
public class MathsHomeWork{
  public static void main (String args[]){
    float a [][]= {{-1,1,6,-3,7},
                 {-3,-3,8,-2,7},
                 {1,2,4,-3,5},
                 {2,4,-2,-2,-4}};
                 
    for (int i=0;i<=a.length-2;i++){
      int k=0;
      for (int j=0;j<=a[0].length-1;j++){
          a[i+1][j]=a[i+1][j]-(((a[i+1][j-k])/(a[i][i]))*a[i][j]);
          k++;
        }
      }
    for (int i=0;i<=a.length-1;i++){
      for (int j=0;j<=a[0].length-1;j++){
        System.out.println(a[i][j]);
      }
    }
  }
}
 