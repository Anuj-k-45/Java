import java.util.*;
public class PrintingPairsOfArray{
  public static void printPairs(int numbers[]) {
    int total=0;
    for (int i=0;i<numbers.length;i++) {
      int current1=numbers[i];
      for (int j=i+1;j<numbers.length;j++){
        int current2=numbers[j];

        System.out.print("(" + current1 + " , " + current2 + ") ");
        total++;
      }
      System.out.println();
    }
     System.out.print("Total pairs are : " + total);
  }
  public static void main (String args[]) {
    int numbers[]={2,4,6,8,10,12};
    printPairs(numbers);

   
  }
}
