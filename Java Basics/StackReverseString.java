//Reverse a string using Stack

import java.util.*;
public class StackReverseString{

    public static void reverseString(String str){
        Stack<Character>s = new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.print("Enter the string you want to reverse : ");
        str=sc.nextLine();
        reverseString(str);
    }
}