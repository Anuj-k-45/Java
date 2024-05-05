import java.util.*;
public class StackDuplicateParinthesis{

    public static boolean checkDuplicate(String str){
        Stack<Character>s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]){
        String str1="(a+b)";
        String str2="((a+b))";
        System.out.println("String 1 is a duplicate bracket string : " + checkDuplicate(str1));
        System.out.println("String 2 is a duplicate bracket string : " + checkDuplicate(str2));
    }
}