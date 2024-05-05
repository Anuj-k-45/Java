import java.util.*;
public class StackValidParinthesis{

    public static boolean isValid(String str){
        Stack<Character>s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(ch=='}' && s.peek()=='{' 
                       || ch==']' && s.peek()=='['
                       || ch==')' && s.peek()=='('){
                        s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        String str="{{()}[]}";
        System.out.print("The given string of parenthisis is Valid : " + isValid(str));
    }
}