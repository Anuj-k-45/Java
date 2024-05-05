import java.util.*;

public class TAvalue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("A-pH1(530nm) : ");
        double a=sc.nextDouble();                       //Takes the input for pH1(530nm)
        System.out.print("A-pH4.5(530nm) : ");
        double b=sc.nextDouble();                       //Takes the input for pH4.5(530nm)
        System.out.print("A-pH1(700nm) : ");
        double c=sc.nextDouble();                       //Takes the input for pH1(700nm)
        System.out.print("A-pH4.5(700nm) : ");
        double d=sc.nextDouble();                       //Takes the input for pH4.5(700nm)

        double A=(a-b)-(c-d);                           //Calculates value of 'A'

        double TA=(A*449.2*28.12)/(26900*1);            //Calculates value of total concentration

        System.out.println("Absorbance (A) = " + A);                 //prints/displays 'A'
        System.out.println("Total anthocyanin content = " + TA);     //prints/displays 'Total concentration'
    }
}