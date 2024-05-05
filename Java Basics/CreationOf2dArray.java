//Create a 2D array
//Mention the total number cells 

import java.util.*;
public class CreationOf2dArray{
  public static void main (String args[]){
    Scanner sc=new Scanner (System.in);
    int matrix[][]=new int[3][4];
    int cells=0;
    int rows=matrix.length;int columns=matrix[0].length;
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        matrix[i][j]=sc.nextInt();
        cells++;
      }
    }
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        System.out.print(matrix[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.print("The total number of cells are : " + cells);


  }
}
 