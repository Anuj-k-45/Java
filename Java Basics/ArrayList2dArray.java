import java.util.*;
public class ArrayList2dArray{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainList.add(list1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(6);
        list2.add(7);
        mainList.add(list2);

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(8);
        list3.add(9);
        list3.add(10);
        mainList.add(list3);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> curr=mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}