package Array;

import java.util.Arrays;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class Two_Sum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,26)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j < nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
