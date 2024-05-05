import java.util.*;
public class LinearSearch{
public static int Loop(int numbers[] , int keys) {
for (int i=0;i<numbers.length;i++) {
  if (numbers[i]==keys)
  return 1;
}
return -1;
}
  public static void main (String args[]) {
  Scanner sc=new Scanner (System.in);
  int numbers[]={1,2,1,2,3,4,5,6,1};
  System.out.print("Entre your key : ");
  int key=sc.nextInt();
  if (Loop(numbers, key)==1) {
    System.out.print("The key is at : ");
    for (int i=0;i<numbers.length;i++) {
    if (numbers[i]==key) {
      System.out.print(i + " ");
    }
  }
  }
  else {
    System.out.print("Not Found!!");
  }
}
} 