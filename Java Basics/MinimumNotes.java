//Minimum Absolute difference using greedy approch

import java.util.*;
public class MinimumNotes{

    public static int minimumNotes(int notes[],int target){
        int answer=0;
        int n=notes.length;
        Arrays.sort(notes);
        for(int i=n-1;i>=0;i--){
            if(target>=notes[i]){
                answer++;
                target=target-notes[i++];
            }
            else if(target==0){
                break;
            }
        }
        return answer;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int notes[]={1,2,5,10,20,50,100,200,500,2000};
        System.out.print("Enter the price you need the change of : ");
        int target=sc.nextInt();
        System.out.println("Minimum number of notes required : " + minimumNotes(notes,target));
    }
}