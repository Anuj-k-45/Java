import java.util.*;
public class ArrayListMaximumElement{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(1);
        list.add(5);
        System.out.println(list);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println("The maximum element in the ArrayList is : " + max);
    }
}