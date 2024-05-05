import java.util.*;
public class FindingCosByExpansion{
  public static int f(int n){
    int fact=1;
    for (int i=2;i<=n;i++){
      fact=fact*i;
    }
    return fact;
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the angle you want to find cos of : ");
    float x=sc.nextFloat();
    System.out.print("Enter number of terms in the series : ");
    int n=sc.nextInt();
    float cos=0;
    for(int i=0;i<=n;i++){
      cos=(float)(cos + ((Math.pow(-1,i)*Math.pow(x,2*i))/f(2*i)));
      System.out.println(cos);
    }
    System.out.print(cos);

  }
}