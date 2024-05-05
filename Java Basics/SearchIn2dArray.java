//Search the given key in a 2D array with increasing order

import java.util.*;
public class SearchIn2dArray{
  public static boolean StaircaseSearch(int matrix[][],int key){
    int startRow=0;
    int startColumn=0;
    int endRow=matrix.length-1;
    int endColumn=matrix[0].length-1;
    boolean found=false;
    while(startRow<=endRow && startColumn<=endColumn){
      if (matrix[startRow][endColumn]==key){
       found=true;
       break;
      }
      else if (matrix[startRow][endColumn]<key){
        startRow++;
      }
      else if (matrix[startRow][endColumn]>key){
        endColumn--;
      }
    }
    return found;
  }
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int matrix[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
    int key=sc.nextInt();
    if (StaircaseSearch(matrix,key)==false){
      System.out.print("Not Found!!!");
    }
    else{
      int startRow=0;
    int startColumn=0;
    int endRow=matrix.length-1;
    int endColumn=matrix[0].length-1;
    boolean found=false;
    while(startRow<=endRow && startColumn<=endColumn){
      if (matrix[startRow][endColumn]==key){
       System.out.print("The key is at : ( " + startRow + " , " + endColumn + " )");
       break;
      }
      else if (matrix[startRow][endColumn]<key){
        startRow++;
      }
      else if (matrix[startRow][endColumn]>key){
        endColumn--;
      }
    }

    }
    
  }
}
 