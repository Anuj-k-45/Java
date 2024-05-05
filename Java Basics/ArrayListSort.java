import java.util.*;
public class ArrayListSort{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(1);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.print("Accending order : " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.print("Decending order : " + list);
    }
}