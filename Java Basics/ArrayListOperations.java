import java.util.*;
public class ArrayListOperations{
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        //Adding element ( Time complexity = O(1) )
        list1.add(10);
        list1.add(27);
        list1.add(32);
        list1.add(47);
        list1.add(54);
        list1.add(69);
        list1.add(72);
        list1.add(1,2000); //Another type of adding an element arrayList.add(index,new_value) insert value at given index
        System.out.println(list1);

        //Get element ( Time complexity = O(1) )
        int element=list1.get(2);
        System.out.println("The element at index 2 is : " + element);

        //Delete element ( Time complexity = O(n) )
        list1.remove(2);
        System.out.print("Remove element at index 2!, we get : ");
        System.out.println(list1);

        //Set element at ( Time complexity = O(n) ) arrayList.set(index,new_value) removes old value and puts new value
        list1.set(3, 1000);
        System.out.println(list1);

        //Contains? ( Time complexity = O(n) )
        System.out.println(list1.contains(69)); //Does it contain 69?
        System.out.println(list1.contains(200));
    }
}