import java.util.*;
public class ReverseAnArray{
  public static void reverse(int numbers[]) {
    int a;
    
    for (int i=0;i<numbers.length/2;i++) {
      a=numbers[i];
      numbers[i]=numbers[numbers.length-(1+i)];
      numbers[numbers.length-(1+i)]=a;
    
  }
}
  public static void main (String args[]) {
    int numbers[] = {1,3,5,7,9,11,13,15}; 
    
    reverse(numbers);
    for (int i=0;i<numbers.length;i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
