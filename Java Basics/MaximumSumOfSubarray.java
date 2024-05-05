import java.util.*;
public class MaximumSumOfSubarray{
  public static void MaximumSumOfSubarrayByBruteForce (int numbers[]) {
    int total=0;
    int max=Integer.MIN_VALUE;
    for (int i=0;i<numbers.length;i++){
      for (int j=i;j<numbers.length;j++){
        int sum=0;
        for (int k=i;k<=j;k++){
          sum=sum+numbers[k];
          if(sum>max) {
            max=sum;
          }
        }
      }
    }
    System.out.println("The maximum sum is : " + max);
  } 
  public static void MaximumSumOfSubarrayByPrefixArray (int numbers[]){
    int currentSum=0;
    int max=Integer.MIN_VALUE;
    int prefix[]=new int[numbers.length];
    prefix[0]=numbers[0];
    for (int i=1;i<numbers.length;i++){
      prefix[i]=prefix[i-1]+numbers[i];
    }
    for (int i=0;i<numbers.length;i++){
      int start = i;
      for (int j=i;j<numbers.length;j++){
        int end = j;
        currentSum=0;
        for (int k=start;k<=end;k++){
          currentSum = (start==0) ? prefix[end] : prefix[end]-prefix[start-1];

          if (currentSum>max) {
            max=currentSum;
          }
          System.out.println(currentSum);
        }
      }

    }
    System.out.print("The maximum sum is : " + max);
  }
  public static void MaximumSumOfSubarrayByKadanesAlgorithm (int numbers[]) {
    int ms=Integer.MIN_VALUE;
    int cs=0;
    
    for (int i=0;i<numbers.length;i++){
      if (numbers[i]<0) {
      if (ms<numbers[i]){
        ms=numbers[i];
      }
    }
    
  
      else {
      cs = cs+ numbers[i];
      if(cs<0) {
        cs=0;
      }
      ms=Math.max(cs, ms);
    
    System.out.print("The maximum sum among all the SubArrays is : " + ms);
  }}
}
  public static void main (String args[]){
    int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    MaximumSumOfSubarrayByBruteForce(numbers);
    //MaximumOfSubarray(numbers);
    //MaximumSumOfSubarrayByKadanesAlgorithm(numbers);
  }
}
 