import java.util.*;
public class SearchInRotatedArray{

    public static int search(int arr[],int si,int ei,int target){
        int mid=si+(ei-si)/2;
        
        //mid Correct
        if(arr[mid]==target){
            return mid;
        }

        //checking line
        //L1
        else if(arr[mid]>=arr[si]){
            //case a: left
            if(target>=arr[si] && target<arr[mid]){
                return search(arr, si, mid-1, target);
            }

            //case b: right
            else{
                return search(arr, mid+1, ei, target);
            }
        }

        //L2
        else{
            //case c: right
            if(target<=arr[ei] && target>arr[mid]){
                return search(arr, mid+1, ei, target);
            }

            //case d: left
            else{
                return search(arr, si, mid-1, target);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={6,7,8,9,10,1,2,3,4,5};
        System.out.print("Enter the target you want to search for : ");
        int target=sc.nextInt();
        int res=search(arr,0,arr.length-1,target);
        System.out.print("The provided target is at : " + res);
    }
}