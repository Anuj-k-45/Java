// Print all the subarrays possible, find total number of subarrays, print sum of each subarray.
// Also find the max and min sum of all (by Brute Force)

import java.util.*;
public class PrintSubarrays{
  public static void printSubarrays(int numbers[]) {
    int total=0;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for (int i=0;i<numbers.length;i++){
      for (int j=i;j<numbers.length;j++){
        int sum=0;
        System.out.print(" ( ");
        for (int k=i;k<=j;k++){
          System.out.print(numbers[k] + " ");
          sum=sum+numbers[k];
        }
        
        if(sum>max) {
            max=sum;
          }
          if (sum<min) {
            min=sum;
          }
        System.out.println(")" + " = " + sum);
        total++;
      }
      
    }
    System.out.println("Total number of SubArrays are : " + total);
    System.out.println("The maximum sum is : " + max);
    System.out.print("The minimum sum is : " + min);
  }
  public static void main (String args[]) {
    int numbers[]={-2,4,-6,8,-10,12,14,-16,};
    printSubarrays(numbers);

  }
}
