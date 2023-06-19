package Array;

import java.util.Arrays;

public class Maxproduct_twoelement {
    public static void main(String[] args) {
       int arr[]={3,4,5,2};
        System.out.println(maxProduct(arr));
    }
    public  static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}
