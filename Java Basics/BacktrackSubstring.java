import java.util.*;
public class BacktrackSubstring{

    public static void backtrack(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL string");
                return;
            }
            else{
                System.out.println(ans);
                return;
            }
        }
        //recursion call
        //Yes
        backtrack(str, ans+str.charAt(i), i+1);
        //No
        backtrack(str, ans, i+1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string you want the substrings of : ");
        String str=sc.next();
        String ans="";
        backtrack(str,ans,0);
    }
}