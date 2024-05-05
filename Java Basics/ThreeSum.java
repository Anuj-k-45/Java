import java.util.*;

public class ThreeSum{
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;                            //skip duplicates
            }

            int left=i+1;
            int right=n-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==0){
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }

                else if(sum<0){
                    left++;
                }

                else{
                    right--;
                }
            }
        }
        return answer;
    }

    public static void main(String args[]){
        int nums[]={-1,0,1,2,-1,-4};
        System.out.println("The list of non-duplicate triplets have sum 0 is : ");
        System.out.println(threeSum(nums));
    }
}