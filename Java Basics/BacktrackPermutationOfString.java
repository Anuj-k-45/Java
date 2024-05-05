//write all the permutation of the given word where total number of permutstions is given as total permutations = n!

import java.util.*;
public class BacktrackPermutationOfString{

    public static void permutation(String str,String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            permutation(newStr, ans+curr);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="abc";
        String ans="";
        permutation(str,ans);
    }
}