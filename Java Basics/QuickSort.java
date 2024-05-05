import java.util.*;
public class QuickSort{

    public static void print(int num[]){
        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i] + " ");
        }
    }

    public static void quickSort(int num[],int si,int ei){
        if(si>=ei){ //base case
            return;
        }
        //last element
        int pidx=partition(num,si,ei);
        quickSort(num, si, pidx-1); //left part
        quickSort(num, pidx+1, ei); //right part
    }

    public static int partition(int num[],int si,int ei){
        int pivot=num[ei];
        int i=si-1; //to make place for elements smaller than pivot

        for(int j=si;j<ei;j++){
            if(num[j] <= pivot){
                i++;
                //swap
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
            }
        }
        i++;
        int temp=pivot;
        num[ei] = num[i]; //dont write pivot=num[i]
        num[i] = temp;
        return i;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={1111,1156,903,776,1091,975,817};
        quickSort(num,0,num.length-1);
        print(num);
    }
}