package Array;

import java.util.Arrays;

public class Suffle_Array {
    public static void main(String[] args) {
       int arr[]={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr,arr.length/2)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int arr[]=new int[n*2];
        for (int i = 0; i <n ; i++) {
            arr[2*i]=nums[i];
            arr[2*i+1]=nums[n+i];
        }
        return arr;
    }
}
