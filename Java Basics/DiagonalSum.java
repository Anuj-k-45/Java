//Find digonal Sum

import java.util.*;
public class DiagonalSum{

  public static int DiagonalSum(int matrix[][]){
    int n=matrix.length-1;
    int diagonalSum=0;
    //if else for even and odd cases to remove the central cell which was added twice
      for(int i=0;i<=n;i++){
        diagonalSum=diagonalSum+matrix[i][i];
      }
      for(int i=0;i<=n;i++){
        for (int j=0;j<=n;j++){
          if (i+j==n){
            diagonalSum=diagonalSum+matrix[i][j];
          }
        }
      }
      if (n%2==0){
        diagonalSum=diagonalSum-matrix[n/2][n/2];
      }
      return diagonalSum;
  }
  public static void main (String args[]){
    int matrix[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
    System.out.print("The diagonal's Sum is : " + DiagonalSum(matrix));
  }
}
 