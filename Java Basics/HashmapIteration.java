import java.util.*;

public class HashmapIteration{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia", 6);
        hm.put("Bhutan", 5);
        hm.put("UK", 40);

        //Iterate-------------------This is how you can iterate in a hashmap
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+ k + " , value=" + hm.get(k));
        }

    }
}