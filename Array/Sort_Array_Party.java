package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort_Array_Party {
    public static void main(String[] args) {
        int arr[]={3,1,2,4,6,8};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int temp[]=new int[nums.length];
        int k=0;

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==0){
                temp[k++]=temp[i];
            }


        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]%2!=0){
                temp[k++]=nums[i];
            }
        }
        return temp;
    }
}
