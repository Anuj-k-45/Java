// Code for Sorting (Assending Order)

import java.util.*;
public class Sorting{
  public static void BubbleSort(int numbers[]){
    int sum=0;
    for (int i=numbers.length-1;i>0;i--){
      for (int j=0;j<i;j++){

        if (numbers[j]>numbers[j+1]){
            int temp=numbers[j];
            numbers[j]=numbers[j+1];
            numbers[j+1]=temp;
            sum++;
        }
      }
    }
    for (int i=0;i<numbers.length;i++){
      System.out.print(numbers[i]+ " ");
    }
    System.out.println();
    System.out.println("The total number of swaps are : " + sum);
  }
  public static void SelectionSort (int numbers[]){
    for (int i=0;i<numbers.length-1;i++){
      int min=i;
      for (int j=i+1;j<numbers.length;j++){
        if (numbers[min]>numbers[j]){
          min=j;
        }
      }
      int temp=numbers[i];
      numbers[i]=numbers[min];
      numbers[min]=temp;
    }
    for (int i=0;i<numbers.length;i++){
      System.out.print(numbers[i] + " ");
    }
  }
  public static void InsertionSort (int numbers[]){
    for (int i=1;i<numbers.length;i++){
        int curr=numbers[i];
        int prev=i-1;
        while(prev>=0 && numbers[prev]>curr){
            numbers[prev+1]=numbers[prev];
            prev--;
        }      
        numbers[prev+1]=curr;
    }
    for (int i=0;i<numbers.length;i++){
        System.out.print(numbers[i] + " ");
    }
  }
  public static void main (String args[]){
    int numbers[]={5,-4,1,3,-2};
    //BubbleSort(numbers);
    //SelectionSort(numbers);
    InsertionSort(numbers);
  }
}
 