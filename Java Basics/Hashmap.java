import java.util.*;

public class Hashmap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        //Creation
        HashMap<String,Integer> hm=new HashMap<>();


        //Insertation O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Bhutan", 6);


        //Printing map---------------------Always unordered (does not follow any order)
        System.out.println(hm);


        //Get O(1)-------------------------used to get the value of any key
        int population=hm.get("India");
        System.out.println("The value of the required key is : "+population);


        //What is you try to get the value of a key which does not exist
        System.out.println(hm.get("Indonesia"));     //it will print null as the key does not exist


        //Contains O(1)----------------------checks if a particular key exists in the hashmap or not
        System.out.println("Our hashmap contains India : "+hm.containsKey("India"));
        System.out.println("Our hashmap contains Indonesia : "+hm.containsKey("Indonesia"));
        

        //Remove O(1)-----------------------removes the provided key (including its value) from the hashmap-----(note:this remove has a return type of int)
        System.out.println("Our hashmap contains Bhutan : "+hm.containsKey("Bhutan"));
        hm.remove("Bhutan");
        System.out.println("Does our hashmap contains Bhutan now after removal : "+hm.containsKey("Bhutan"));
        System.out.println(hm);


        //Size
        System.out.println("The size of our hashmap is : "+hm.size());


        //isEmpty
        System.out.println("Is our hashmap empty : " + hm.isEmpty());


        //Clear------------------clears the hashmap
        hm.clear();
        System.out.println("Our final hashmap is : " + hm);
    }
}