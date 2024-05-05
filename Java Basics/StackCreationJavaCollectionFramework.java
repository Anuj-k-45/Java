//Creation of a stack using java collection framework

import java.util.*;
public class StackCreationJavaCollectionFramework{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}