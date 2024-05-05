import java.util.*;
public class MergeSort{
    
    public static void print(int num[]){
        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i] + " ");
        }
    }
    
    public static void mergeSort(int num[],int si,int ei){
        if(si>=ei){ //base case
            return;
        }

        int mid=si+(ei-si)/2;
        mergeSort(num, si, mid); //left divide
        mergeSort(num, mid+1, ei); //right divide 
        merge(num, si, ei, mid); //merging and sorting in new array
    }

    public static void merge(int num[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i=si; //iterator for left part
        int j=mid+1; //iterator for right part
        int k=0; //iterator for temp array

        while(i<=mid && j<=ei){
            if(num[i]<num[j]){
                temp[k]=num[i];
                i++;
            }
            else{
                temp[k]=num[j];
                j++;
            }
            k++;
        }

        //if left part remains at the end
        while(i<=mid){
            temp[k++]=num[i++];
        }

        //if rigth part remains at the end
        while(j<=ei){
            temp[k++]=num[j++];
        }

        //copy temp to original array
        for(k=0,i=si ; k<=temp.length-1 ; k++,i++){
            num[i]=temp[k];
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int num[]={5,7,2,9,4,1,8};
        mergeSort(num, 0, num.length-1);
        print(num);
    }
}