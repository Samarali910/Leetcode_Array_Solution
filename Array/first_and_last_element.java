package Array;

import java.util.Arrays;

public class first_and_last_element {
    public static void main(String[] args) {
       int arr[]={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
       int arr[]=new int[2];
       arr[0]=firstindex(nums,target);
       arr[1]=lastindex(nums,target);
       return arr;
    }
    public static int firstindex(int nums[],int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                index=mid;
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return index;
    }
    public static int lastindex(int nums[],int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                index=mid;
                start=mid+1;
            } else if (nums[mid]<target) {
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return index;
    }


}
