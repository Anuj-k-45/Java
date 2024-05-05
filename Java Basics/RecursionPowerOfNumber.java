import java.util.*;
public class RecursionPowerOfNumber{

  public static int PowerNormal(int base,int exp){
    if (exp==0){
      return 1;
    }
    
    int ans=base*PowerNormal(base, exp-1);
    return ans;
  
  }

  public static int PowerLogn(int base,int exp){
    int ans;
    if (exp==1){
      return base;
    }
    if (exp==0){
      return 1;
    }
    int halfPow=PowerLogn(base,exp/2);
    ans=halfPow*halfPow;
  
    if(exp%2!=0) {
      ans=base*ans;
    }

    return ans;
  }

  public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the base : ");
    int base=sc.nextInt();
    System.out.print("Enter the exponent : ");
    int exp=sc.nextInt();

    //System.out.println("The solution for the give numbers is : " + PowerNormal(base,exp));
    System.out.println("The solution for the give numbers is : " + PowerLogn(base,exp));
  }  
}
