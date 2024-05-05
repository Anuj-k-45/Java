import java.util.*;
public class StackPushAtBottom{
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
        return;
    }
    public static void main(String argz[]){
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        pushAtBottom(s, 777);
        while (!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}