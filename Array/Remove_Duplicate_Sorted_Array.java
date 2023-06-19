package Array;
//leetcode 26
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
public class Remove_Duplicate_Sorted_Array {
    public static void main(String[] args) {
      int arr[]={0,0,1,1,1,2,2,3,3,4};
       System.out.println(removeDuplicates(arr));

    }
    public static int removeDuplicates(int[] nums) {
        int count=1;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]!=nums[i-1]){
               nums[count]=nums[i];
               count++;
            }
        }
        return count;
    }
}
