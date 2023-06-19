package Array;

import java.util.Arrays;

public class Build_Array {
    public static void main(String[] args) {
        int []nums={0,1,2,5,3,4};
        System.out.println(Arrays.toString(build(nums)));
    }
    public static int[] buildArray(int[] nums){
        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
    public static  int[] build(int nums[]){
        return buildArra(nums,new int[nums.length],0);
    }


    public static int[] buildArra(int[] nums,int arr[],int i){

        if (i== nums.length){
            return arr;
        }
        arr[i]=nums[nums[i]];
        return buildArra(nums,arr,i+1);
    }

}
