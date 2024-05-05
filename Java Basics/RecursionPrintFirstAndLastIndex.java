import java.util.*;
public class RecursionPrintFirstAndLastIndex{

  public static int findlast(int num[],int key,int i){
    
    if (i<0){
      return -1;
    }
    if (num[i]==key){
      return i;
    }
    return findlast(num,key,i-1);
  }

  public static int findfirst(int num[],int key,int i){
    
    if (i==num.length-1){
      return -1;
    }
    if (num[i]==key){
      return i;
    }
    return findfirst(num,key,i+1);
  }

  public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    int num[]={1,3,5,6,3,5,7,4,2,9,2};
    System.out.print("Enter the key you want to find : ");
    int key=sc.nextInt();
    System.out.println("The first index of key is at : " + findfirst(num,key,0));
    System.out.print("The last index of key is at : " + findlast(num,key,num.length-1));
  }  
}
