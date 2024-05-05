import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("A-pH4.5(530nm) : ");
        double b=sc.nextDouble();
        System.out.println();
        System.out.print("A-pH1(700nm) : ");
        double c=sc.nextDouble();
        System.out.println();
        System.out.print("A-pH4.5(700nm) : ");
        double d=sc.nextDouble();
        System.out.println();
        System.out.print("TA : ");
        double TA=sc.nextDouble();
        System.out.println();

        double a=((26900*TA)/(449.2*28.12))+c-d+b;

        System.out.print("A-pH1(530nm) : " + a);
    }
}