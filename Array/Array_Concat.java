package Array;

import java.util.Arrays;

public class Array_Concat {
    public static void main(String[] args) {
         int arr[]={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
      int arr[]=new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
             arr[i]=nums[i];
             arr[nums.length+i]=nums[i];
        }
        return arr;
    }
}
