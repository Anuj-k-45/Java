import java.util.*;
public class LargestNumberInAnArray{
  public static int GetLargest(int numbers[]) {
    int Largest= Integer.MIN_VALUE;
    for (int i=0;i<numbers.length;i++) {
      if (Largest<numbers[i]){
        Largest=numbers[i];
      }
    }
  return Largest;
  }
  public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
    int numbers[]= new int[3];
    for (int i=0;i < numbers.length;i++ ) {
      System.out.print("Entre your number " + (i+1) + ")");
      numbers[i]=sc.nextInt();
    }
    System.out.print("The Largest number is : "+ GetLargest(numbers));
    
    
  }
}
