package Array;

import java.util.Arrays;

public class Running_sum_oneD_array {
    public static void main(String[] args) {
         int arr[]={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums){
        for (int i = 1; i <nums.length ; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
