import java.util.*;

public class TwoSome{

    // public static LinkedList<Integer> TwoSum(int num[],int target){
    //     LinkedList<Integer> answer=new LinkedList<>();
    //     for(int i=0;i<num.length-1;i++){
    //         for(int j=i+1;j<num.length;j++){
    //             if(num[i]+num[j]==target){
    //                 answer.addLast(i);
    //                 answer.addLast(j);
    //                 return answer;
    //             }
    //         }
    //     }
    //     return answer;
    // }

    // public static List<Integer> TwoSum(int num[],int target){
    //     List<Integer> answer=new ArrayList<>();
    //     for(int i=0;i<num.length-1;i++){
    //         for(int j=i+1;j<num.length;j++){
    //             if(num[i]+num[j]==target){
    //                 answer.add(num[i]);
    //                 answer.add(num[j]);
    //                 return answer;
    //             }
    //         }
    //     }
    //     return answer;
    // }

    public static List<List<Integer>> TwoSum(int num[],int target){
        List<List<Integer>> answer=new ArrayList<>();
        int idx=0;
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    List<Integer> pair=new ArrayList<>();
                    pair.add(num[i]);
                    pair.add(num[j]);
                    answer.add(pair);
                }
            }
        }
        return answer;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={1,2,3,4,5,6,7,8,9};
        System.out.print("Enter your target value : ");
        int target=sc.nextInt();
        System.out.print(TwoSum(num,target));
    }
}