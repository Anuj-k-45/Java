import java.util.*;
public class BinarySearch{

  public static int binarySearch(int numbers[], int key) {
    int start=0; int end=numbers.length-1;
    while (start<=end) {
      int mid=(start+end)/2;

      if (numbers[mid]==key) {
      return mid;
      }
      else if (numbers[mid]<key) {
        start=mid+1;
      }
      else {
        end=mid-1;
      }
    }
    return -1;
  }

  public static void main (String args[]) {
    Scanner sc=new Scanner (System.in);
    int numbers[]= {2,4,6,8,10,12,14,16};
    System.out.print("Enter the key you want to find within the array : ");
    int key=sc.nextInt();
    System.out.print("The index for the key is : " + binarySearch(numbers, key));

  }
}
