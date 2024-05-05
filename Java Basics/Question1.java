import java.util.*;
public class Question1{
  public static void main (String args[]){
  Scanner sc=new Scanner(System.in);
  int position = sc.nextInt();
 
 
  if (position<0){
  position=position*(-1);
}
 
  if (position==1){
  System.out.print(2);
}
 
  else if (position%3==0){
  for (int i=1;;i++){
    int m=i*3;
    if (m==position){
      System.out.print(i);
      break;
    }
  }
}
 
  else if (position%3==2){
  for (int i=1;;i++){
    int m=i*3;
    if (m==position-2){
      System.out.print(i+1);
      break;
    }
  }
}
 
  else if (position%3==1){
  for (int i=1;;i++){
    int m=i*3;
    if (m==position-1){
      System.out.print(i+2);
      break;
    }
  }
}
 
  else {
    System.out.print("0");
  }
}
}