package Array;

import java.util.Arrays;

public class Maximum_Product_diff {
    public static void main(String[] args) {
        int arr[]={5,6,2,7,4};
        System.out.println(maxProductDifference(arr));
    }
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-1]*nums[n-2]-nums[0]*nums[1];
    }
}
