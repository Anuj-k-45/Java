import java.util.*;
public class RecursionCheckSorted{

  public static boolean isSorted(int num[],int i){
    if(i==num.length-1){
      return true;
    }
    if(num[i]>num[i+1]){
      return false;
    }
    return isSorted(num,i+1);
  }

  public static void main (String args []){
    Scanner sc=new Scanner (System.in);
    int num[]={1,2,3,4,0};

    System.out.println("The given array is sorted : " + isSorted(num, 0));

  }  
}
