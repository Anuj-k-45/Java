import java.util.*;
public class IdentityMatrix{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    int rows=sc.nextInt();
    System.out.print("Enter the number of columns : ");
    int columns=sc.nextInt();
    int num[][]=new int[rows][columns];
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        num[i][j]=sc.nextInt();
      }
    }

    if(rows!=columns){
      System.out.print("The given matrix is not a square matrix hence it is not Identity");
    }
    else{
      int flag=1;
      for(int i=0;i<rows;i++){
        for(int j=0;j<rows;j++){
          if(i==j && num[i][j]!=1){
            flag=0;
            break;
          }
          else if(i!=j && num[i][j]!=0){
            flag=0;
            break;
          }
        }
      }
      if(flag==1){
        System.out.print("The matrix is Identity");
      }
      else{
        System.out.print("The matrix is not an Identity");
      }
    }
  }
}